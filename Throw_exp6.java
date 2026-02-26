public class Throw_exp6 {
    
    static void login(String Username){
        if (Username == null) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        else{
            System.out.println("Login Successfull");
        }
    }

    public static void main(String [] args){
        try {

            login("Vishal@123");
            login(null);
            login("success@123");
        } catch (IllegalArgumentException e) {
            System.out.println( "Error : " + e.getMessage());
        }

        finally{
            System.out.println("login in process");
        }
        System.out.println("program is executed ");
    }
    
}
