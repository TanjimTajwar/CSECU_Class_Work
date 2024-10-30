import java.util.Scanner;

class student {
    String name;
    int age;

    public void gocorona() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OPP01 {
    public static void main(String[] args) {
        student s1 = new student();
        Scanner scan = new Scanner(System.in);

        s1.name = scan.nextLine();
        s1.age = scan.nextInt();
        s1.gocorona();
        scan.close();
    }
}