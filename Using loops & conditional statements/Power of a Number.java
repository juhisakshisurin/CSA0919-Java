import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = 1;
        if (p >= 0) {
            for (int i = 1; i <= p; i++) {
                result = result * n;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid exponent");
        }
    }
}
