import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dec = 0, base = 1;
        while (n > 0) {
            int digit = n % 10;
            dec = dec + digit * base;
            base = base * 2;
            n = n / 10;
        }
        System.out.println(dec);
    }
}
