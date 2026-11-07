import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a;

        // Read the boolean value from input
        a = sc.nextBoolean();

        // Printing numeric representation
        System.out.print(a ? 1 : 0);
    }
}