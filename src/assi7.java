import java.time.LocalDate;
import java.util.Scanner;

public class assi7 {
    public static void main(String[] args){
        System.out.println("\t\t\t Periodic Reminder System ⌛");

        System.out.println("chose options \n 1: A to add task \n 2: to view task ");
        System.out.print("Choice:: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
            case 1:
                add();
            case 2:
                view("no any titles added yet "," read title again",0,LocalDate.now());

        }


    }
    public static void add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the task title: ");
        String title = input.nextLine();
        System.out.print("Please enter the task description: ");
        String description = input.nextLine();
        System.out.print("Please enter the task priority: ");
        int priority = input.nextInt();
        System.out.print("Please enter the date : ");
        String date = input.nextLine();
        LocalDate localDate = LocalDate.parse(date);
        view(title,description,priority,localDate);

        System.out.println("Task added successfully");

        System.out.println("UR TASK IS :: ");

        System.out.println("\t\t\t Task Title: " + title);
        System.out.println("\t\t\t Task Description: " + description);
        System.out.println("\t\t\t Task Priority: " + priority);
        System.out.println("\t\t\t Task Date: " + localDate);




    }
    public static void view(String title, String description, int priority, LocalDate localDate ){
        System.out.println("\t\t\t Task Title: " + title);
        System.out.println("\t\t\t Task Description: " + description);
        System.out.println("\t\t\t Task Priority: " + priority);
        System.out.println("\t\t\t Task Date: " + localDate);

    }
}