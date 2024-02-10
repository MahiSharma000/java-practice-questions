import java.util.Scanner;

public class SimpleSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] num = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            num[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (num[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    num[j] = false;
                }
            }
        }
        System.out.println("____________________________________________________________________________________________________________________________________________");
        for (int i = 2; i <= n; i++) {
            if (num[i] == true) {
                System.out.println(i);
            }
        }
    }
}
