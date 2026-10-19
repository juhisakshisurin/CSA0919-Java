import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int product = 1;

        while (m > 0) {
            int digit = m % 10;
            product = product * digit;
            m = m / 10;
        }

        System.out.println("Product: " + product);
    }
}
