import java.util.ArrayList;
import java.util.Scanner;

class Students {
  int roll_number;
  String name;

  Students(int roll_number, String name) {
    this.roll_number = roll_number;
    this.name = name;
  }

  public int getRollNumber() {
    return roll_number;
  }

  public String getName() {
    return name;
  }
}

class university {
  public static void main(String[] args) {
    
    ArrayList<Students> students = new ArrayList<>();

    Students student;

    boolean conti = false;
    do{
      System.out.println("University Management System");
      System.out.println("1. New Student");
      System.out.println("2. Search Student");
      System.out.println("3. All Students");
  
      Scanner scan = new Scanner(System.in);
  
      int user_choise = scan.nextInt();
  
      if (user_choise == 1) {
        System.out.println("Create New Student");
        System.out.println("Enter name for new student: ");
        String name = scan.nextLine();
        scan.nextLine();
        System.out.println("Roll number for new student: ");
        int roll_number = scan.nextInt();

        student = new Students(roll_number, name);

        students.add(student);

        System.out.println("Student Created successfully!");
        System.out.println("Student name is: " + student.name);
      }
      else if(user_choise == 2){
        System.out.println("Search : ");
        scan.nextLine();
        String search = scan.nextLine();
        for (Students s : students){
          if (s.name == search){
            System.out.println("found");
          }
          else if (s.name != search){
            System.out.println("not found");
          }
        }
      }else if(user_choise == 3){
        System.out.println("All Students");
        for (Students stu : students) {
          System.out.println(stu.getName());
          System.out.println("Student Roll: " + stu.getRollNumber());
        }
      }
       else {
        System.out.println("Invalid Option");
      }

      System.out.println("Do you want to continue? [y/n]: ");
      char user_input = scan.next().charAt(0);
     
      if (user_input == 'y') {
        conti = true;
      } else {
        conti = false;
      }

    } while (conti);

    
  }
}