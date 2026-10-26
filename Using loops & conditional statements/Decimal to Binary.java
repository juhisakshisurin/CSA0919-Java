import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = "";
        if (n == 0) bin = "0";
        while (n > 0) {
            bin = (n % 2) + bin;
            n = n / 2;
        }
        System.out.println(bin);
    }
}
