public class Try_finally {
    public static void main (String[]args){
        int a = 10;
        int b = 0;
         try {
            int c = a/b;
            System.out.println("ans = " + c);
         } catch (ArithmeticException e) {
            System.out.println("Eroor : 10 can not divided by 0  " + e );
         }

         finally{
            System.out.println("finally block always execute ");
         }

         System.out.println("continue program ");
    }
}
