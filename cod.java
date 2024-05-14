public class cod {
    // attributes , properties , class variables , or just var 
    protected String name, team  ;
    protected int attack , defence , hp , members , players ;
    protected float win_percent ;
    protected boolean is_cont , is_win , is_loss;

    // constructor or setter if it works 
    cod(String name , String team , int attack , int defence , int hp, int members , int players ){
        this.name = name;
        this.team = team;
        this.attack = attack;
        this.defence = defence;
        this.hp = hp;
        this.members = members;
        this.players = players;
    }
    // lezz create some methods or functions or like some actions like tha all are same thin 
    public static void double_battle (cod p1, cod p2){
        System.out.println("battle start of " + p1.name + " and " + p2.name );
        System.out.println(p1.name + " attacts " + p2.name);
        System.out.println(p2.name + " hp left is " + (p1.attack - p2.hp));
        // addin some logics for game 
        if (p2.hp <=0 ){
            System.out.println("alas " + p2.name + "is dead" );
        }
        else if (p2.hp >=1){
            System.out.println("dw , " + p2.name +  " alive now his turn to attack " );
            System.out.println(p2.name + " attacts " + p1.name);
            System.out.println(p1.name + " hp left is " + (p2.attack - p1.hp));
            if (p1.hp <=0){
                System.out.println("alas " + p1.name + "is dead");
            }
            else if (p1.hp >=1){
                System.out.println("dw , " + p1.name + "alive");
            }
        }        
        
    }
    public static void main (String[] args){
        /// lezz create some objs now 
        cod p1 = new cod("rauf", "red", 50, 100, 120, 1, 1);
        cod p2 = new cod("umar", "blue", 60, 105, 130, 1, 1);

        cod.double_battle(p1, p2);
    }

    
}
