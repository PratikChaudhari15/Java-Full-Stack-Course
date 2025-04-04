class Database {
    static {
        System.out.println("Static Block Executed - Database Connection Initialized!");
    }

    public static void fetchData() {
        System.out.println("Fetching Data from Database...");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Execution Started...");
        fetchData();
    }
}