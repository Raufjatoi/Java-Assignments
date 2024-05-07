package lab;
import java.util.Scanner;
public class bank {
    String name ;
    long CNIC , account_num;
    double balance;
    int pin;

    bank(String name, long CNIC , long account_num , int pin , double balance){
        this.name = name;
        this.CNIC = CNIC;
        this.account_num = account_num;
        this.balance = balance;
        this.pin = pin;
    }

    public double check(){
        return balance;
    }
    public void depo(double amount){
        this.balance += amount;
        
    }
    public double withd (double amount){
        if ((amount - balance) > 25000){
            return amount ;
        }
        else{
            System.err.println("cant withdraw , the amount should be more than 2500 \n after withdrawing ");
        }
        return 0;
    }
    public static void main (String[] args ){
        bank A1 = new bank("Rauf",1111111,000001,010101,30000);
        System.out.println("Balance is " + A1.balance);
        System.out.println("choice options : \n 1:deposit \n 2:withdraw");
        Scanner in = new Scanner(System.in);
        System.out.print("Choice :: > ");
        int c = in.nextInt();
        if (c == 1){
            System.out.print("enter the amount u wanna deposit :: > ");
            double amount = in.nextDouble();
            A1.depo(amount);
            System.out.println(A1.balance);
        }
        else if (c == 2){
            System.out.print("enter the amount u wanna wihtdraw :: > ");
            double amount = in.nextDouble();
            A1.withd(amount);
            System.out.println(A1.withd(amount));
        }
        else{
            System.out.println("Invalid message");
        }
        System.out.println("balance" + A1.balance);
    }



    
}
