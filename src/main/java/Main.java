public class Main {

    public static void main(String[] args) {
        CsvFileWriter csvFileWriter = new CsvFileWriter();
        User[] users = new User[100];

        //Create users
        for (int i = 0; i < users.length; i++) {
            User.UserCreator create = new User.UserCreator();
            users[i] = create.createUser();
        }

        String fileName = System.getProperty("user.home")+"/users.csv";

        System.out.println("Write CSV file:");
        CsvFileWriter.writeToCsvFile(users, fileName);
    }

}
