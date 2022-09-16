package chapter6.ex8;

public class ConnectionManager {
    static int counter = 0;
    Connection[] connections = new Connection[10];

    public ConnectionManager () {
        for (int i =0; i< 10; i++) {
            connections[i] = makeConnection(i);
        }
    }

    public Connection getConnection(){
        counter++;
        if (!(counter>10)) {
            System.out.println("Connection Object " + connections[counter].index);
            return connections[counter];
        }
        return null;

    }

    public static Connection makeConnection(int index) {
        System.out.println("Connection Created");
        return Connection.createConnection(index);
    }

    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        for (int i =0; i<= 11; i++) {
            try {
                connectionManager.getConnection();}
            catch (Exception e) {
                System.out.println("null");
            }
        }
    }
    static class Connection {
        int index;
        private Connection(int index){
            this.index = index;
        }

        public static Connection createConnection (int index) {
            return new Connection(index);
        }
    }
}