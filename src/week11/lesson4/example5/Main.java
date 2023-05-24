package week11.lesson4.example5;

public class Main {

    public static void main(String[] args) {
        Connection connection = Connection.POSTGRESQL;
        System.out.println(connection.getConnectionName());
        connection.connectToDB();
    }
}
