import java.util.Scanner;

public class ATM_using_Nested_Try {
    public static void main(String[]args){
        int balance = 5000;
        Scanner sc = new Scanner(System.in);

       try {
            System.out.println("Enter Withdrowal Amount");
            int Amount = sc.nextInt();

            try {
                if (Amount <= 0) {
                    System.out.println("Invalid Amount Entered");
                }
                else if (Amount > balance) {
                    System.out.println("Insufficient Balance");
                }
                else{
                    balance = balance - Amount;
                    System.out.println("Withdrowal Successful");
                    System.out.println("Reamening Balance : " + balance);
                }
            } catch (Exception e) {
                
                System.out.println("Inner catch Business logic");
            }


       } catch (Exception e) {
            System.out.println("Outer catch invalid input !!!");
       }

       finally{
        System.out.println("Transcation complete");
       }
        sc.close();
    }
}
