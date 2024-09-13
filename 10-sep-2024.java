import java.util.Date;
import java.util.ArrayList;

class Artwork{
    String name;
    String artist;
    Date date;
    String type;
    Artwork(String name , String artist , Date date , String type){
        this.name = name;
        this.artist = artist;
        this.date = date;
        this.type = type;
    }
    void display (ArrayList<Artwork> arts , Artwork a){
        for(Artwork A : arts ){
            if (A.name == a.name){
                System.out.println("Art name : "+ A.name + " By : "+ A.artist + " Added : " + a.date);
            }
        }

    }
}
class Painting extends Artwork{
    Painting(String name , String artist , Date date , String type){
        super(name, artist, date, type);
    }
}
class Sculpture extends Artwork{
    Sculpture(String name , String artist , Date date , String type){
        super(name, artist, date, type);
    }
}
class Photograph extends Artwork{
    Photograph(String name , String artist , Date date , String type){
        super(name, artist, date, type);
    }
}
class Online_Art_Gallery{
    public static void main(String[] args) {
        Date d1 = new Date(124, 3, 4);
        Date d2 = new Date(124, 2, 4);
        Date d3 = new Date(124, 5, 4);
        Date d4 = new Date(124, 7, 8);
        Date d5 = new Date(124, 9, 3);
        Painting p1 = new Painting("a smiley emoji", "Ahsan", d1, "painting");
        Sculpture s1 = new Sculpture("something", "umar", d5, "sculpture");
        Photograph pp1 = new Photograph("random pic ", "rauf", d3, "photo");
        Painting p2 = new Painting("a planet", "rauf", d2, "painting");

        ArrayList<Artwork> arts = new ArrayList<>();
        arts.add(p1);
        arts.add(p2);
        arts.add(pp1);
        arts.add(s1);

        p1.display(arts, p2);

    }
}