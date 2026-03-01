class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String Massage){
        super(Massage);
    }
}

class Bank{
     double Balance = 5000;

    public void Withdrow (double Amount) throws InsufficientBalanceException{
        if (Amount > Balance) {
            throw new InsufficientBalanceException("Insufficient fund plese maintain the balance ");
        }
        Balance = Balance - Amount;
        System.out.println("Withdrow Successful...");
        System.out.println("Remaining Balance : " + Balance);
    }
}

public class Custom_exception {
    public static void main(String [] args) {
        Bank acc = new Bank();

        try {
            acc.Withdrow(700);
            acc.Withdrow(8000);
            acc.Withdrow(500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally{
            System.out.println("ThankYou for Choosing Us");
        }
        System.out.println("Continue Transacting...");
    }
}
