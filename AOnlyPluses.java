import java.util.Scanner;

class AOnlyPluses {

    public static int calMax(int x, int y, int z) {
        int max = 0;
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5 - a; b++) {
                int c = 5 - a - b;
                int present = (x + a) * (y + b) * (z + c);
                max = Math.max(present, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner Jara = new Scanner(System.in);
        System.out.println("\nWelcome to my program.\nTo start ,you have you have to");
        System.out.print("tell the number of testes you want to do,\nplease enter the number of testes: ");
        int test = Jara.nextInt();
        for (int a = 0; a < test; a++) {
            System.out.print("\n-Enter the first integer:");
            int x = Jara.nextInt();
            System.out.print("\n-Thank you,Now Enter the second integer:");
            int y = Jara.nextInt();
            System.out.print("\n-Almost there,Enter the last integer:");
            int z = Jara.nextInt();

            int ans = calMax(x, y, z);
            System.out.println("\n<<So the maximun product can be found is: " + ans + ">>");
        }
        Jara.close();
    }
}