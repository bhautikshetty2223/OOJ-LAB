package Week3;

class Account {
    private String accountNumber;
    private double balance;

    public void setAccount(String accno){
        accountNumber = accno;
    }    

    public String getAccount(){
        return accountNumber;
    }

    public void setBalance(double bal){
        if (bal>0){
            balance = bal;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class Acc{
    public static void main(String[] args){
        Account a1 = new Account();
        a1.setAccount("1234565");
        a1.setBalance(50000);

        System.out.println("Account Number: "+a1.getAccount());
        System.out.println("Balance: "+ a1.getBalance());

        a1.setBalance(a1.getBalance()+2000);
        System.out.println("New Balnce: "+ a1.getBalance());
    }
}

