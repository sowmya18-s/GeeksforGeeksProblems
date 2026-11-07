import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read string (nextLine handles strings containing spaces)
        String s = sc.nextLine();

        // Read integer
        int n = sc.nextInt();

        // Read float
        float f = sc.nextFloat();

        // Take the floor value of float and cast to int
        int ff = (int) Math.floor(f); 

        System.out.println(s);
        System.out.println(n);
        System.out.println(ff);

        sc.close();
    }
}