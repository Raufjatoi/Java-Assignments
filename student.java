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

class University {
  public static void main(String[] args) {
    
    ArrayList<Students> students = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    boolean conti;
    do {
      System.out.println("University Management System");
      System.out.println("1. New Student");
      System.out.println("2. Search Student");
      System.out.println("3. All Students");
  
      int user_choice = scan.nextInt();
      scan.nextLine(); // Consume the newline character

      if (user_choice == 1) {
        System.out.println("Create New Student");
        System.out.print("Enter name for new student: ");
        String name = scan.nextLine();

        System.out.print("Roll number for new student: ");
        int roll_number = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        Students student = new Students(roll_number, name);
        students.add(student);

        System.out.println("Student created successfully!");
        System.out.println("Student name is: " + student.getName());
      } else if (user_choice == 2) {
        System.out.print("Search by name: ");
        String search = scan.nextLine();
        boolean found = false;

        for (Students s : students) {
          if (s.getName().equals(search)) {
            System.out.println("Student found: " + s.getName() + " (Roll Number: " + s.getRollNumber() + ")");
            found = true;
            break; // Exit loop once found
          }
        }
        if (!found) {
          System.out.println("Student not found.");
        }
      } else if (user_choice == 3) {
        System.out.println("All Students:");
        for (Students stu : students) {
          System.out.println("Name: " + stu.getName() + ", Roll Number: " + stu.getRollNumber());
        }
      } else {
        System.out.println("Invalid Option");
      }

      System.out.print("Do you want to continue? [y/n]: ");
      char user_input = scan.next().charAt(0);
      conti = (user_input == 'y');

    } while (conti);

    scan.close();
  }
}
