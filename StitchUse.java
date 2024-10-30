import java.util.Scanner;

public class StitchUse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num) {
            case 5:
                System.out.println("Red");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 20:
                System.out.println("White");
                break;

            default:
                System.out.println("Did not match");
                break;

        }
        scan.close();
    }

}
