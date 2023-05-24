package week11.lesson4.example5;

public enum Connection {

    MYSQL("MySQL Database Connection"){
        @Override
        public void connectToDB() {
            System.out.println("I am connecting to MYSQL");
        }
    },
    POSTGRESQL("PostgreSQL Database Connection"){
        @Override
        public void connectToDB() {
            System.out.println("I am connecting to PostgreSQL");
        }
    },
    ORACLEDB("Oracle Database Connection"){
        @Override
        public void connectToDB() {
            System.out.println("I am connecting to Oracle");
        }
    },
    MS_SQL("Microsoft SQL Database Connection"){
        @Override
        public void connectToDB() {
            System.out.println("I am connecting to Microsoft SQL");
        }
    };

    Connection(String connectionName){
        this.connectionName = connectionName;
    }

    private String connectionName;

    public String getConnectionName() {
        return connectionName;
    }

    public abstract void connectToDB();

}
