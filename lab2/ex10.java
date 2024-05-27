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
    static int i = 0;


    //o Add a song to the playlist (check for duplicates).
    public static void add (Song song){
        songs[count] = song ;
        count ++;
            }
    //o Remove a song from the playlist.
    public void removeItem(Song song) {
        int r = 0;
        for (int i = 0; i < r; i++) {
            if (songs[i].title.equals(song.title)) {
                
                for (int j = i; j < r - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[r - 1] = null;
                r--;
            }
        }
    }

    // shuffle around 


    // play song by title 

    public static void play (){
        while (true){
            System.out.println(songs[i].title + " by " + songs[i].artist + " genra is " + songs[i].genre);
            i ++;

            if (i == 3){
                break;
            }

        }
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

        MusicPlayer.play();
        



        
    }
}
