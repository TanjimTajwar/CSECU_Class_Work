import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadandWrite {
    public static void main(String[] args) {
        File myfile = new File("Yoga.txt");

        try {
            // Create the file if it doesn't exist
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter("Yoga.txt");
            writer.write("I am a student");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
