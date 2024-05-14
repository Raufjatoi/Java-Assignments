public class Artist { // Renamed for clarity

    private String singer;
    private String from;
    private int rank;
    private int albums;
    private String song1;
    private String song2;
    private String song3;
    private boolean english;

    // Constructor
    public Artist(String singer, String from, String song1, String song2, String song3, 
                 int rank, int albums, boolean english) {

        this.singer = singer;
        this.from = from;
        this.song1 = song1;
        this.song2 = song2;
        this.song3 = song3;
        this.rank = rank;
        this.albums = albums;
        this.english = english;
    }

    // Instance Methods (non-static)
    public void getBasicInfo() {
        System.out.println(singer + " from " + from);
    }

    public void getTopSongs() {
        System.out.println("Songs:");
        System.out.println("1: " + song1);
        System.out.println("2: " + song2);
        System.out.println("3: " + song3);
    }

    public void introduce() {
        System.out.println("This is " + singer);
    }

    public static void main(String[] args) {
        Artist s1 = new Artist("Ed Sheeran", "England/UK", "Shape of You", "Thinking Out Loud", "Perfect", 1, 5, true);

        s1.introduce();
        s1.getBasicInfo();
        s1.getTopSongs(); 
    }
}
