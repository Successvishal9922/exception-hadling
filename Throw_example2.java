import java.util.Scanner;

public class Throw_example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        try{
            if(n < 0){
            throw new ArithmeticException("negative number is not alloud");
            }
            else{
            System.out.println("Successfull " + n);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
        

        System.out.println("Error is handled");
        sc.close();
    }
}
