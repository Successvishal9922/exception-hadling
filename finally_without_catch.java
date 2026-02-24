public class finally_without_catch {
    public static void main(String[]args){
        try{
            int a [] = {1,2,3,4,5};
            System.out.println(a[9]);
            // program will crash but finallay block executes first and then throws and exception
        }
        finally{
            System.out.println("finally block executed ");
        }
        /*catch(ArithmeticException e ){
             System.out.println("catch cannot use without try but try can be use ");
        }*/
    }
}
