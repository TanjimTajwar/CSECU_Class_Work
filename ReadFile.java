import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File Ahona = new File("Jim.txt");
            Scanner sc = new Scanner(Ahona);
            while (sc.hasNextLine()) {
                String Abnus = sc.nextLine();
                System.out.println(Abnus);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

}
