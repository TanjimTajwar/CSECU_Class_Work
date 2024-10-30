import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleCreate {
    public static void main(String[] args) {
        File JarifFile = new File("Jim.txt");

        try {
            if (JarifFile.createNewFile()) {
                System.out.println("New file is created");
            } else {
                System.out.println("File already exsist");
            }
            FileWriter Twriter = new FileWriter("Jim.txt");
            Twriter.write("I am not bad at all");
            System.out.println("Writting done");
            Twriter.close();
        } catch (IOException a) {
            System.out.println("Error found");
            a.printStackTrace();
        }
    }

}
