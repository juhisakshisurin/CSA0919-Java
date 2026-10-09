/*Java program that takes two integers as input from the user and calculates their sum, difference, product, quotient, and remainder using arithmetic operators.*/

import java.util.Scanner;
public class arithmetic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum:" + (a+b));
        System.out.println("Difference" + (a-b));
        System.out.println("Product" + (a*b));
        System.out.println("Quotient" + (a/b));
        System.out.println("Remainder: " + (a%b));
    }
}
