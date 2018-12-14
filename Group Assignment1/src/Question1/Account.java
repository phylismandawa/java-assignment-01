package Question1;

public class Account 
{
    private int accountNumber;
    private double balance=0.0;
    
    public static void main(String [] args)
    {
        Account c1= new Account(875464);
        System.out.println(c1.getAccountNumber());
        c1.credit(500);
        System.out.println(c1.getBalance());
        c1.debit(500);
        c1.toString();
    }
    
    public Account(int accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance= balance;
    }
    public Account(int accountNumber)

    {
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void credit(double amount)
    {
        double m=0.0;
     setBalance(500);
     m=this.balance;
     this.balance=m+amount;
    }
    public void debit (double amount)
    {
        double k=0.0;
        if(this.balance>=amount)
        {
          k= this.balance-amount;
          this.balance=k;
          System.out.println("Amount withdraw");
          System.out.println(getBalance());
        }
        else
        {
            System.out.println("Amount withdrawn exceed the current balance");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
