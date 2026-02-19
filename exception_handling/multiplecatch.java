package exception_handling;

import java.util.Scanner;

public class multiplecatch {
    public static void main(String[]args){
        int a [] = new int[5];
        Scanner sc = new Scanner(System.in);
        try {

         
            for (int i = 0; i < 7; i++) {
                a[i] = sc.nextInt();
            }
            // try block throws only that exp which occurs first in this case array out of bound exp ouccurs first 
            int s = 10;
            int t = 0;
            int c = s/t;
            System.out.println("Result = " + c);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        catch(ArithmeticException e){
            System.out.println("Error: can not divide by zero");
        }

        sc.close();
    }
}
