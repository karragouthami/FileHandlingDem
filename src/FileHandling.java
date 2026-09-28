import java.io.*;
public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "student.txt";

        try {
            // 1. Create a file
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write data into the file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: Gouthami\n");
            writer.write("Course: Java Programming\n");
            writer.write("Topic: File Handling\n");
            writer.close();

            System.out.println("Data written successfully.");

            // 3. Read data from the file
            FileReader reader = new FileReader(fileName);
            int ch;

            System.out.println("\nFile Contents:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

            // 4. Append data to the file
            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write("Status: Learning Java\n");
            appendWriter.close();

            System.out.println("\nData appended successfully.");

            // 5. Display file information
            System.out.println("\nFile Information:");
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");

            // 6. Delete the file (uncomment if needed)
            /*
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            }
            */

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


	}
