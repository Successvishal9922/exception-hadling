public class Throws_prac1 {
    
    static void devide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException(  a + " cannot devide by " + b);
        } 
        int c = a/b;
        System.out.println("ans : " + c);
    }

    public static void main(String[]args){
        try {
            devide(10, 2);
            devide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
        System.out.println("testing... ");
    }
}
