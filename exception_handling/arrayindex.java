package exception_handling;

import java.util.Scanner;

public class arrayindex {
    public static void main(String[] args) {
       int a[] = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 5 elements:");
        
       try {
            for (int i = 0; i < 10; i++) {
                a[i] = sc.nextInt();
            }
       } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index is out of bounds.");
    
       }
       sc.close();
    }
}
