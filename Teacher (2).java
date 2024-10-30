public class Teacher {
    String name, gender;
    int number;

    Teacher() {
        System.out.println("No Value");
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        number = p;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("Number:" + number);
    }
}
