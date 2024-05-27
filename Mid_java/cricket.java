package Mid_java;

class Player {
    String name; 
    int runs_scored , wickets_taken;

    // constructor 
    public Player(String name , int runs_scored , int wickets_taken){
        this.name = name;
        this.runs_scored = runs_scored;
        this.wickets_taken = wickets_taken;
    }

}

class CricketMatch{
    static Player [] team1 = new Player[11]; // cause in cricket there are 11 players 
    static Player [] team2 = new Player[11];
    static int count = 11;
    public static void addplayers(Player p1 , Player p2 , Player p3 , Player p4 , Player p5 , Player p6 , Player p7 , Player p8 , Player p9 , Player p10 , Player p11){
    
    }

    public static void TotalScore(){
        int score = 0;
        for (int i = 0; i < count; i++ ){
            team1[i].runs_scored += score ;
        }
        System.out.println(score);
        

    }

    
}

public class cricket {

    
}
