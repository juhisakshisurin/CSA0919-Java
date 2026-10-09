/*Write a Java program to print the Fibonacci series up to a given number using loops.*/
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();
        int a = 0, b=1;
        System.out.println("Fibonacci Series:");
        for (int i=0 ; i <= n; i++){
            System.out.println(a + "");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
