class shape {
    String color;
    int length;
}

class triangle extends shape {
    triangle() {
        System.out.println("Inharitance is ready");
    }

    triangle(String color, int length) {
        this.color = color;
        this.length = length;
    }

    void printInfo() {
        System.out.println("Colour is " + color);
        System.out.println("Area is " + 0.5 * length * length);
    }
}

class squire extends triangle {
    squire(String color, int length) {
        this.color = color;
        this.length = length;
    }
}

public class Inharitance {
    public static void main(String[] args) {
        triangle object1 = new triangle();
        triangle object2 = new triangle("red", 12);
        squire object3 = new squire("white", 5);
        object3.printInfo();
        object1.printInfo();
        object2.printInfo();
    }
}
