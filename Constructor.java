class Go {
    String name;
    String className; // Renamed to avoid using reserved keyword 'class'

    Go(String name, String className) {
        this.name = name;
        this.className = className;
    }

    void print(String name, String className) { // Added parameter types
        System.out.println(name);
        System.out.println(className);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Go s1 = new Go("Amit", "Class 5"); // Using the corrected class name
        s1.print(s1.name, s1.className); // Correct method call
    }
}
