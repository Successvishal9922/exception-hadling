package exception_handling;

import java.util.Scanner;

public class nullpoinexp {
    public static void main(String[] args) {
        String str = null;
        
        try {
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception occurred.");
        }
        
        int n [] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        try {
            for (int i = 0; i < 6; i++) {
                n [i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            
        }
        sc.close();
    }

    
}
