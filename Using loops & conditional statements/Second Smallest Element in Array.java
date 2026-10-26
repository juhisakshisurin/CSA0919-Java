import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                second = min;
                min = a[i];
            } else if (a[i] < second && a[i] != min) {
                second = a[i];
            }
        }

        if (second == Integer.MAX_VALUE)
            System.out.println("No second smallest element");
        else
            System.out.println(second);
    }
}
