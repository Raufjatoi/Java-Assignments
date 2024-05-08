package TBFG;

public class text_based_game {
    String name;
    int hp,attack,defense;

    text_based_game(String name, int hp, int attack , int defense){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    public static void fight(text_based_game fighter1, text_based_game fighter2){
         int f2 = fighter2.defense - fighter1.attack;
         int f1 = fighter1.defense - fighter2.attack;
         if (f2 <= 0){
            //System.out.println(f2);
            System.out.println(fighter2.name +" is dead ");
            System.out.println(fighter1.name + " Won");
         }
         else if (f1 <= 0) {
            System.out.println(fighter1.name + " is dead");
            System.out.println(fighter2.name + " Won ");
         } 
         else if (f1 > 0 && f2 > 0){
            System.out.println("both are alive after a fight");
            System.out.println(fighter1.name + " have " + fighter1.attack + " attack power \n  and defense is " + (fighter1.defense - fighter2.attack) );
            System.out.println(fighter2.name + " have " + fighter2.attack + " attack power \n  and defense is " + (fighter2.defense - fighter1.attack) );
         }
         else if (f1 <= 0 && f2 <= 0){
            System.out.println("its a draw");
         }
         else {
            System.out.println("somethin happened , tha shouldnt be ");
         }
    }
    public static void main(String[] args) {
        System.out.println("\t\t TAXT BASED FIGHTING GAME ");
        System.out.println("\t PLAYERS : ");
        
        text_based_game fighter1 = new text_based_game("ABDUL RAUF", 120, 500, 800);
        text_based_game fighter2 = new text_based_game("UMAR", 200, 600, 820);

        System.out.println("\t 1:" + fighter1.name);
        System.out.println("defence = " + fighter1.defense);
        System.out.println("attack = " + fighter1.attack);
        System.out.println("hp = " + fighter1.hp);

        System.out.println("\t 2:" + fighter2.name);
        System.out.println("defence = " + fighter2.defense);
        System.out.println("attack = " + fighter2.attack);
        System.out.println("hp = " + fighter2.hp);


        text_based_game.fight(fighter1, fighter2);
    }

    
}
