import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Print the last digit of the number
        System.out.println(Math.abs(n) % 10);
    }
}