// 45. University Exam Management
// Scenario: Develop an exam management system for a university where exams can be scheduled for different courses.
// Each course has a code, name, and credit hours.
// Concepts: Classes, Inheritance, Date, ArrayList
// Task: Create a Course class and an Exam class.
// Implement methods to schedule exams and display exam schedules for students.
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

class Course {
    String code;
    String name;
    int credit_hours;
    
    Course(String code, String name, int credit_hours) {
        this.code = code;
        this.name = name;
        this.credit_hours = credit_hours;
    }
    
    String getCode() {
        return this.code;
    }
    
    String getName() {
        return this.name;
    }
    
    int getCreditHours() {
        return this.credit_hours;
    }
}
class Exam {
    ArrayList<Course> courses;
    Date[] dates;
    
    Exam(ArrayList<Course> courses, Date[] dates) {
        this.courses = courses;
        this.dates = dates;
    }
    
    ArrayList<String> schedule_exam(ArrayList<Course> c, Date[] d) {
        int i = 0;
        ArrayList<String> details = new ArrayList<String>();
        for (Course s : c) {
            String detail = "Course Name: " + s.name + ", Code: " + s.code + 
                            ", Credit Hours: " + s.credit_hours + 
                            "\nScheduled on: " + d[i];
            details.add(detail);
            i++;
        }
        return details;
    }
    
    void display(ArrayList<String> details) {
        for (String s : details) {
            System.out.println(s);
        }
    }
}

class University_Exam_Management {
    public static void main(String[] args) {
        // Creates courses
        Course course1 = new Course("CS101", "Introduction to Computer Science", 3);
        Course course2 = new Course("MATH202", "Calculus II", 4);
        Course course3 = new Course("PHY303", "Physics I", 3);
        
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        
        // Create exam dates
        Date[] examDates = new Date[3];
        Calendar cal = Calendar.getInstance();
        
        cal.set(2024, Calendar.SEPTEMBER, 20); // Exam date for course 1
        examDates[0] = cal.getTime();
        
        cal.set(2024, Calendar.SEPTEMBER, 22); // Exam date for course 2
        examDates[1] = cal.getTime();
        
        cal.set(2024, Calendar.SEPTEMBER, 25); // Exam date for course 3
        examDates[2] = cal.getTime();
        
        // Create Exam object and schedule exams
        Exam exam = new Exam(courseList, examDates);
        ArrayList<String> examDetails = exam.schedule_exam(courseList, examDates);
        
        // Display exam schedule
        exam.display(examDetails);
    }
}
