// 50.University Timetable Management
// Scenario: Create a university timetable management system where courses can be scheduled.
// Each course has a code, name, and instructor.
// Concepts: Classes, Inheritance, ArrayList
// Task: Design a Course class and a Timetable class.
// Implement methods to add courses to the timetable and display the weekly schedule.
import java.util.Date;
import java.util.ArrayList;
class Course {
    String code;
    String name;
    String instructor;
    Course(String code, String name , String intructor){
        this.code = code;
        this.name = name;
        this.instructor = instructor;
    }
}
class Timetable {
    Date date;
    Course course;
    Timetable(Date date , Course course){
        this.date = date;
        this.course = course;
    }
    void addCourse(Course c, Date d){
        System.out.println("the course "+ c + "is shuduled to "+ d);
    }  
    void display(ArrayList<Timetable> t){
        for (Timetable ta : t ){
            addCourse(ta.course,ta.date );
        }
    } 
}
class University_Timetable_Management{
    public static void main(String[] args) {
        Date d1 = new Date(123, 12, 1);
        Date d2 = new Date(123, 3, 12);
        Date d3 = new Date(123, 2, 10);

        Course dld = new Course("dld01", "Digital logic design", "Sir zeeshan");
        Course pf = new Course("pf010", "programming fundamental", "Sir Owais");
        Course la = new Course("la100", "Linear Algebra", "Sir ajeeb");

        Timetable firstPaper = new Timetable(d1, dld);
        Timetable secondPaper  = new Timetable(d2, pf);
        Timetable thirTimetable = new Timetable(d3, la);

        ArrayList<Timetable> t = new ArrayList<>();
        t.add(firstPaper);
        t.add(secondPaper);
        t.add(thirTimetable);
        
    }
}