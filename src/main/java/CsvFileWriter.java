import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriter {

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "firstName,lastName,email,password";

    public static void writeToCsvFile(User[] users, String fileName) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            for (User user : users) {
                fileWriter.append(String.valueOf(user.getFirstName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getLastName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getPassword());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter.");
                e.printStackTrace();
            }

        }
    }
}