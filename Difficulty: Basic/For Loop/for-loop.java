import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Loop from 1 to n to print the first n positive even numbers
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");
        }

        sc.close();
    }
}