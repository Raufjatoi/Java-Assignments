// Design a class BankAccount with fields accountNumber, balance, and methods deposit(double amount) and withdraw(double amount).
// Ensure that the withdrawal method checks if there are sufficient funds.

class BankAccount{
    int accountNumber;
    double balance;
    BankAccount( int accountNumber , double balance ){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit ( double amount ){
        this.balance += amount;
        System.out.println("amount added");
    }
    void withdraw ( double amount){
        if ( amount < this.balance ){
            System.out.println(" here is the amount of " + amount + " remaining balance is " + this.balance);
        }
    }
}

public class last_prc {
    public static void main(String[] args) {
         BankAccount account =  new BankAccount(1010, 700000);

         account.deposit(10000);
         System.out.println("account balance " + account.balance);
         account.withdraw(9000);
         System.out.println("accout balance noe " + account.balance);
    }

    
}
