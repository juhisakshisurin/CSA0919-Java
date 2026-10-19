import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        System.out.println("Volume of sphere: " + (4.0 / 3) * 3.14 * r * r * r);
    }
}
