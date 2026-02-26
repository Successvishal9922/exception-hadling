public class Throw_exp4 {
    
    static void Salary(int a){
        if (a < 15000) {
            throw new ArithmeticException("Salary below companey standards");
        } else {
            System.out.println("salary accepted");
        }
    }

    public static void main(String[]args){

        try {
              
        Salary(50000);

        System.out.println("okk");
        Salary(55);

        } catch (ArithmeticException e) {
           System.out.println("Error : " + e.getMessage());
        }
      
        System.out.println("program status");
    }
}
