public class Throw_example3 {
    static void divide(int a, int b){
        if (b==0) {
            throw new ArithmeticException( a  + " cannot be dided by " + b);
        }
        int c = a/b;
        System.out.println("division of a and b : " + c);
    }

    public static void main(String[]args){
        try {
            divide(10, 2);
            divide(10, 0);
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        finally{
            System.out.println("Program executed successfully");
        }
      System.out.println("after catching error this will print");

    }
}
