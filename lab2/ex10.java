package lab2;
//5. Music Playlist:

//o Create playlists based on genre (create a separate playlist object) and add songs
//from the main playlist based on their genre.


// Create a class named Song with member variables for title, artist, and genre.
class Song {
    String title , artist , genre ;

    //constructor 
    public Song(String title , String artist , String genre ){
        this.title = title ; 
        this.artist = artist;
        this.genre = genre;
    }
}

// Create a class named MusicPlayer that has an array of Song objects representing a playlist.
class MusicPlayer{
    static Song[] songs = new Song[100];
    static int count = 0;

    //o Add a song to the playlist (check for duplicates).
    public static void add (Song song){
        //if (song in songs ){
           // System.out.println("song already exists ");
        //}
        // else 
        songs[count] = song;
        
    }
    //o Remove a song from the playlist.

    // shuffle around 


    // play song by title 

    public static void play (Song song){
        System.out.println("playin " + song.title + " by " + song.artist + " and its " + song.genre + "type ");
    }

    
    
    
    

}

public class ex10 {
    public static void main(String[] args) {

        Song s1 = new Song("Photograph", "ed sheeran", "pop ");
        Song s2 = new Song("intentions","justin biber" , "pop");
        Song s3 = new Song ("cirles " , "post malone" , "pop/rap");

        MusicPlayer.add(s1);
        MusicPlayer.add(s2);
        MusicPlayer.add(s3);

        MusicPlayer.play(s1);
        MusicPlayer.play(s2);
        MusicPlayer.play(s3);



        
    }
}
