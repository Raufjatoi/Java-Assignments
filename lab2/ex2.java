package lab2;

class calculator {
    public static int add (int num1 , int num2 ){
        return (num1 + num2) ;
    }
    public static int sub (int num1 , int num2){
        return (num1 - num2) ;
    }
    public static int mul (int num1 , int num2 ){
        return (num1 * num2);
    }
    public static int div (int num1 , int num2){
        return (num1 / num2 );
    }
}


public class ex2 {
    public static void main (String[] args){
        System.out.println(calculator.add(2,4));
        System.out.println(calculator.sub(4, 2));
        System.out.println(calculator.mul(2, 4));
        System.out.println(calculator.sub(4, 2));
    }
}
    

