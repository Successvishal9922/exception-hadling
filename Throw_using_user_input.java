import java.util.Scanner;

public class Throw_using_user_input {

    static void Login(String Username){
        if (Username == null || Username.isEmpty()) {//this null is actual null keyword 
            throw new IllegalArgumentException("username cannot be null ");
        } else {
            System.out.println("Login Successfull");
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter Login attempts");
        int attempts = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Enter username for attempt " + i + " : " );
            String user = sc.nextLine();//when i take null input from user via scanner that is not actual null that is string "null"

            try {
                Login(user);
            } catch (IllegalArgumentException e) {
                System.out.println("Error " + e.getMessage());
            }
            catch(Exception e ){
                System.out.println("Error " + e.getMessage());
            }
            finally{
                System.out.println("Running...");
    
            }
            sc.nextLine();
        }
        System.out.println("Execution Completed");
        
    }
}
