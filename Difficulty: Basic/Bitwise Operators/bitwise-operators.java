import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Perform the required bitwise operations
        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = ~e;

        // Print the results separated by spaces
        System.out.println(d + " " + e + " " + f + " " + g);
    }
}