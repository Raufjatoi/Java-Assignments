//playing with functions or methods whatever ya like to say same thin

public class functions {
    String singer, from ;
    int rank,albums;
    String song1,song2,song3;
    boolean english;


 // constructor 
functions(String singer , String from , String song1 , String song2 , String song3, int rank , int albums , boolean english  ){
    this.singer = singer ;
    this.from = from;
    this.song1 = song1;
    this.song2 = song2;
    this.song3 = song3;
    this.rank = rank;
    this.albums = albums;
    this.english = english;
}
// methods aka func 
private static void get (String singer , String from ){
    System.out.println(singer + "from" + from);

}
private static void get (String singer , String from , String song1, String song2 , String song3 , int rank){
    System.out.println(singer + "from" + from );
    System.out.println("songs\n" + "1 :" + song1 + "\n" + "2 :" + song2 + "\n" + "3 :" + song3);

}
private static void get (String singer){
    System.out.println("this is " + singer);
}
    
}
public static  void main (){
    functions s1 = new functions("ed sheeran", "England/Uk", "Collide", "Lego house", "bloodstream", 4, 5, true);
    s1.get("ed");



}