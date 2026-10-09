/*Write a Java program to calculate the factorial of a given number using loops.*/
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
