import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0, digits = 0;
        if (n < 0) {
            System.out.println("Not Armstrong");
            return;
        }
        int t = n;
        do {
            digits++;
            t = t / 10;
        } while (t > 0);
        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
