package chapter18.ex31;

import chapter18.Person;
import nu.xom.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class People extends ArrayList<Person> {
    public People(String fileName) throws Exception {
        Document doc = new Builder().build(fileName);
        Elements elements =
                doc.getRootElement().getChildElements();
        for(int i = 0; i < elements.size(); i++)
            add(new Person(elements.get(i)));
    }
}
public class Ex31 {
    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
                new Person("Dr. Bunsen", "Honeydew", "Street 1",
                        "New York", "NY", 10001),
                new Person("Gonzo", "The Great", "Street 2",
                        "New York", "NY", 20002),
                new Person("Phillip J.", "Fry", "Street 3",
                        "New York", "NY", 30003));
        System.out.println(people);
        Element root = new Element("people");
        for(Person p : people)
            root.appendChild(p.getXML());
        Document doc = new Document(root);
        Person.format(System.out, doc);
        Person.format(new BufferedOutputStream(
                new FileOutputStream("People.xml")), doc);
        People p = new People("People.xml");
        System.out.println(p);
    }
}
