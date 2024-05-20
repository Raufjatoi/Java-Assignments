package lab2;
class book {
    String title,author , genre;

    //contructor 
    book(String title , String author , String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void get (){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.genre);

    }


}


public class ex3 {
    public static void main (String[] args){
        book b1 = new book("The breif history of time", "Stephen hawking", "time");
        b1.get();
        
    }
}