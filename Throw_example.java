public class Throw_example {
    public static void main(String[]args){
        int age = 16;
        if (age <=18) {
            throw new ArithmeticException("not eligible for vote");
        }
        System.out.println("Eligible");
        
    }
}
