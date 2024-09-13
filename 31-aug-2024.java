// 22. School Grading System
// Scenario: Develop a grading system where teachers can assign grades to students for different subjects.
// Each subject has a name, code, and maximum marks.
// Concepts: Classes, Inheritance, ArrayList
// Task: Create a Subject class and a Grade class.
// Implement methods to assign grades to students and calculate their overall performance
class Subject{
    String name;
    String code;
    int marks;
    int maximum_marks;
    Subject(String name, String code , int marks){
        this.name = name;
        this.code = code;
        this.maximum_marks = 100;
        this.marks = marks;
    }
    String getName(){
        return name;
    }
    String getCode(){
        return code;
    }
    int getMaximumMarks(){
        return marks;
    }
}
class Grade extends Subject{
    char grade;
    Grade(String name, String code , int marks){
        super(name,code,marks);
        this.grade = '-';
    }
    void addgrade(Subject s){
        if(s.marks <= 60){
            this.grade = 'D';
        }
        else if (s.marks > 60 || s.marks <= 70){
            this.grade = 'C';
        }
        else if (s.marks > 70 || s.marks <= 80){
            this.grade = 'B';
        }
        else if (s.marks > 80){
            this.grade = 'A';
        }   
    }
}
class school_grading_system{
    public static void main(String[] args) {
        Grade s1 = new Grade("pysics", "py", 57);
        Grade s2 = new Grade("biology", "bio", 66);
        
        s1.addgrade(s1);
        s2.addgrade(s2);

        System.out.println(s1.grade);
        System.out.println(s2.grade);
    }
}