package chapter20.ex1;

import chapter20.Constraints;
import chapter20.DBTable;
import chapter20.SQLInteger;
import chapter20.SQLString;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface SQLBoolean {
    String name() default "";
    Constraints constraints() default @Constraints;
}
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface SQLCharacter {
    int value() default 0;
    String name() default "";
    Constraints constraints() default @Constraints;
}
@DBTable(name = "MEMBER")
class Member {
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger
    Integer age;
    @SQLCharacter(value = 15,
            constraints = @Constraints(primaryKey = true))
    String handle;
    static int memberCount;
    @SQLBoolean Boolean isVIP;
    public String getHandle() { return handle; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String toString() { return handle; }
    public Integer getAge() { return age; }
    public Boolean isVIP() { return isVIP; }
}


public class Ex1 {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("arguments: annotated classes");
            System.exit(0);
        }
        for(String className : args) {
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if(dbTable == null) {
                System.out.println(
                        "No DBTable annotations in class " + className);
                continue;
            }
            String tableName = dbTable.name();
// If the name is empty, use the Class name:
            if(tableName.length() < 1)
                tableName = cl.getName().toUpperCase();
            List<String> columnDefs = new ArrayList<String>();
            for(Field field : cl.getDeclaredFields()) {
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if(anns.length < 1)
                    continue; // Not a db table column
                if(anns[0] instanceof SQLInteger) {
                    SQLInteger sInt = (SQLInteger) anns[0];
// Use field name if name not specified
                    if(sInt.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sInt.name();
                    columnDefs.add(columnName + " INT" +
                            getConstraints(sInt.constraints()));
                } else if(anns[0] instanceof SQLString) {
                    SQLString sString = (SQLString) anns[0];
// Use field name if name not specified.
                    if(sString.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sString.name();
                    columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")" +
                            getConstraints(sString.constraints()));
                } else if(anns[0] instanceof SQLBoolean) {
                    SQLBoolean sBol = (SQLBoolean) anns[0];
// Use field name if name not specified
                    if(sBol.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sBol.name();
                    columnDefs.add(columnName + " BOOLEAN" +
                            getConstraints(sBol.constraints()));
                } else if(anns[0] instanceof SQLCharacter) {
                    SQLCharacter sChar = (SQLCharacter) anns[0];
// Use field name if name not specified.
                    if(sChar.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sChar.name();
                    columnDefs.add(columnName + " CHARACTER(" +
                            sChar.value() + ")" +
                            getConstraints(sChar.constraints()));
                }
                StringBuilder createCommand = new StringBuilder(
                        "CREATE TABLE " + tableName + "(");
                for(String columnDef : columnDefs)
                    createCommand.append("\n " + columnDef + ",");
// Remove trailing comma
                String tableCreate = createCommand.substring(
                        0, createCommand.length() - 1) + ");";
                System.out.println("Table Creation SQL for " +
                        className + " is :\n" + tableCreate);
            }
        }
    }
    private static String getConstraints(Constraints constraints1) {
        String constraints = "";
        if(!constraints1.allowNull())
            constraints += " NOT NULL";
        if(constraints1.primaryKey())
            constraints += " PRIMARY KEY";
        if(constraints1.unique())
            constraints += " UNIQUE";
        return constraints;
    }
}
