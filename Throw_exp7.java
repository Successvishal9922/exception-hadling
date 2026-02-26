public class Throw_exp7 {
    
    static void withdrow(int balance,int Amount){
        if (Amount <= 0) {
            throw new  IllegalArgumentException("amount can not smaller then 0");

        }
        else if (Amount > balance) {
            throw new ArithmeticException("insufficient fund");
        }
        else{
            System.out.println("remaining balance : " + balance);
        }
    }

    public static void main(String[]args){
        try {
            
        } catch (Exception e) {
            
            
        }
    }
}
