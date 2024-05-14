package TBFG;
import java.util.Scanner;

public class game{
    //attributes or properties 
    String name;
    int hp , attack ;

    //contruct 
    game(String name , int hp, int attack){
        this.name = name ;
        this.hp = hp;
        this.attack = attack;
    }
     // functions or methods 
     public static  void fight( game p1 , game p2){
        // fight 1 
        int f1 = p1.attack - p2.hp;
        if (f1 <= 0){
            System.out.println(p2.name + "lost");

        }
        else if (f1 >=1){
            //fight 2 if the p2 survive 
            int f2 = p2.attack - p1.hp;
            if (f2 <=0){
                System.out.println(p1.name + "lost");

            }
            else if (f2 <=1){
                System.out.println("after the first round both are alive ");
                System.out.println(p2.name + "=" + f1 + "hp left \n" + p1.name + "=" + f2 + "hp left" );
            }
        }
           
     }
     public static void main(String[] args) {
        System.out.println("\t\t TEXT BASED FIGHTING GAME ");
        System.out.print("enter player one : ");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();  
        System.out.print("enter the hp: ");
        int hp1 = sc.nextInt();
        System.out.print("Enter the attack: ");
        int attack1 = sc.nextInt();
        game p1 = new game(name1, hp1, attack1);

        System.out.print("enter player two : ");
        String name2 = sc.nextLine();  
        System.out.print("enter the hp: ");
        int hp2 = sc.nextInt();
        System.out.print("Enter the attack: ");
        int attack2 = sc.nextInt();
        game p2 = new game(name2, hp2, attack2);

        game.fight(p1, p2);


     }

}