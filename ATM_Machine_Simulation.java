class InvalidPinException extends Exception{
    public InvalidPinException (String Massage){
        super(Massage);
    }
}

class InsufficientBalancedException extends RuntimeException{
    public InsufficientBalancedException (String Massage){
        super(Massage);
    }
}

class BankA{
    double Balance = 50000;
    int Correct_pin = 9924;

    public void Withdrow (Double Amount){
        if (Amount > Balance) {
            throw new InsufficientBalancedException("Insufficient fund plese try low Amount or Check Balance");
        }
        Balance = Balance - Amount;
        System.out.println("Transaction Successful...");
        System.out.println("Remaining Balnace : " + Balance);
    }

    public void Verify_Pin (int pin) throws InvalidPinException{
        if (Correct_pin != pin) {
           throw new InvalidPinException("plese enter correct pin");
        }
         System.out.println("pin veryfied");
    }
}

public class ATM_Machine_Simulation {
    public static void main (String [] args){
        BankA Acc = new BankA();

        try {
            Acc.Verify_Pin(9924);;
            Acc.Withdrow(60000.0);;  // try big amount
        } 
        catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch(InsufficientBalancedException e){
            System.out.println("Error : " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for using ATM");
        }
    }
}
