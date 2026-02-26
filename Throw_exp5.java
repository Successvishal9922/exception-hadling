public class Throw_exp5 {
    static void check_even(int a){
        if (a % 2 != 0) {
            throw new RuntimeException("only even allowed");
        } else {
            System.out.println("even number accepted ");
        }
    }

    public static void main(String [] args){
        try {
            check_even(0);
            check_even(3);//here occur an exception then it directly goes to catch block 
            check_even(4);//if catch clock handle exception then other remaining program will run but try block stop excuting thats whay check_even(4) doent executed  
        } catch (RuntimeException e) {

            System.out.println("Error : " + e.getMessage());
        }
        finally{
            System.out.println("program executing");
        }

        System.out.println(" still processing... ");
    }
}
/*
🧠 Core Rule (Very Important)

When exception occurs inside try:

1️⃣ Remaining code inside try stops
2️⃣ Control jumps to matching catch
3️⃣ finally executes (if present)
4️⃣ Program continues after try-catch block
*/
