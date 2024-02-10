import java.util.Scanner;

public class Strobogrammatic {
    public static boolean check(int n) {
        if (n == 0) {
            return true; // 0 is considered strobogrammatic
        }

        int n1 = 0, num = n;
        while (n > 0) {
            int r = n % 10;
            if (r == 2 || r == 3 || r == 4 || r == 5 || r == 7) {
                return false;
            }
            if (r == 6) {
                r = 9;
            } else if (r == 9) {
                r = 6;
            }
            n1 = (n1 * 10) + r;
            n = n / 10;
        }
        return n1 == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean res = check(n);
        if (res) {
            System.out.println("STROBOGRAMMATIC NUMBER");
        } else {
            System.out.println("NOT A STROBOGRAMMATIC NUMBER");
        }
    }
}
