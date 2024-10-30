class sorry {
    String name;
    int num;

    sorry(String name, int num) {
        this.name = name;
        this.num = num;
    }

    void noname() {
        System.out.println("Name:" + name);
        System.out.println("Number:" + num);
    }
}

public class Practice02 {
    public static void main(String[] args) {
        sorry s1 = new sorry("Jara", 1713525105);
        s1.noname();
    }
}
