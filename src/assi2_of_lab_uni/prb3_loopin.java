package assi2_of_lab_uni;

//Password Checker (while loop): Write a program that prompts the user to enter a password and
//uses a while loop to keep asking until they enter a strong password (meeting certain criteria like length and complexity).

import java.util.Scanner;

public class prb3_loopin {
    public static void main(String[] args){
        System.out.println("\t\t\t PASSWORD CHECKER PROGRAM 🔑");
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter your password 👀: ");
            String password = in.nextLine();
            if(isValidPassword(password)){
                System.out.println("hmm Strong one ✅");
                break;
            }
            else{
                System.out.println("huh not so strong ❌ , try again ");
            }
        }


    }
    private static boolean isValidPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[a-zA-Z].*") &&  // Contains letters
                password.matches(".*\\d.*") &&         // Contains numbers
                password.matches(".*[!@#$%^&*+=?].*"); // Contains symbols
    }

}
