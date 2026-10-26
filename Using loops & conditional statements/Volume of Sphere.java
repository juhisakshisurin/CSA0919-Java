import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.printf("%.2f%n", volume);
    }
}
