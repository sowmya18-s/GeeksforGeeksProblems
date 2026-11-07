import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        switch (n) {
            case 1:
                System.out.print("Stop");
                break;
            case 2:
                System.out.print("Standby");
                break;
            case 3:
                System.out.print("Go");
                break;
            default:
                System.out.print("Unknown");
                break;
        }
        
    }
}