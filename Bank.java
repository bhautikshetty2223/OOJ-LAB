import java.util.*;

class InsuffBalance extends Exception{
    public InsuffBalance(String m){
        super(m);
    }
}

public class Bank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            double balance = 5000;
            System.out.println("Enter amount to withdraw: ");
            double amt = sc.nextDouble();

            if(amt>balance)
                throw new InsuffBalance("Amount to be withrawn can't be more than the Balance");
            
            balance-= amt;
            System.out.println("Remaining Balance: " + balance);
        }
        catch(InsuffBalance e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Non Numeric value entered");
        }
    }
}