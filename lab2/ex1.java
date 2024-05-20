package lab2;
//class 
class Student {
    String name , roll_number;
    int sub1 , sub2 , sub3 ;

// constructor
Student(String name , String roll_number , int sub1 , int sub2 , int sub3 ){
    this.name = name ;
    this.roll_number = roll_number ;
    this.sub1 = sub1 ;
    this.sub2 = sub2 ;
    this.sub3 = sub3 ;
}

}
public class ex1 {
    public static void main (String[] args){
        Student student1 = new Student("Abdul Rauf ", "32" , 45, 56, 78);

        System.out.println(student1.roll_number);


    }
    
}
