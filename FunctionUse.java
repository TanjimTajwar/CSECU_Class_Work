import java.util.Scanner;

class nice {
    public static void printSomething(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String name = Scan.nextLine();
        printSomething(name);
        Scan.close();
    }
}