public class Multiple_catch_with_finally {
    public static void main(String[]args){
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(" Result : " + c);

            int ar [] = {1,2,3,4,5};
            System.out.println(ar [9]); 
        } 
        catch (ArithmeticException e) {
            System.out.println("Error Occured : any number cannot dided by 0 " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Array out bound " + e);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }

        System.out.println("Program ended ");
    }
}
/*Only ONE catch block executes.

Even though we wrote 3 catch blocks:

First exception = ArithmeticException

So only that catch runs

Other catch blocks are skipped */
