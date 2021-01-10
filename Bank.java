import java.util.Scanner;
 
class BankAccount {
    private int acno;
    private float bal=0;
    Scanner get = new Scanner(System.in);
    BankAccount()
    {
        System.out.println("Enter Account Number:\n");
        acno = get.nextInt();
        System.out.println("Enter Initial Balance:\n");
        bal = get.nextFloat();        
    }
    void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited: \n");
        amount = get.nextFloat();
        bal = bal+amount;
        System.out.println("Deposited! Account Balance is "+bal);
    }
    void withdraw()
    {
        float amount;
        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();
        if(amount<bal)
        {
            bal = bal-amount;
            System.out.println("Amount Withdrawn!! Available Balance: "+bal);
        }
        else
        {
            System.out.println("Insufficient funds!!");
        }
    }
}
 
public class Bank {
    public static void main(String[] args)
    {
        BankAccount myObj = new BankAccount();
        myObj.deposit();
        myObj.withdraw();       
    }
}
