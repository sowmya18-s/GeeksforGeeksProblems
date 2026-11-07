import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String separator = sc.nextLine();

        // Print s1, separator, and s2 together with a new line
        System.out.println(s1 + separator + s2);
    }
}