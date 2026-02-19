package exception_handling;

import java.util.Scanner;

public class divide_by_zero {
    public static void main(String[] args) {
        System.out.println("enter A and B");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}