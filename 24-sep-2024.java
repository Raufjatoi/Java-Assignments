// 51. Online Fitness Program
// Scenario: Develop an online fitness program where users can sign up for different workout plans.
// Plans can be for Weight Loss, Muscle Gain, or General Fitness.
// Concepts: Classes, Inheritance, Interface
// Task: Create a base class WorkoutPlan and derive WeightLossPlan, MuscleGainPlan, and GeneralFitnessPlan classes.
// Implement an interface Subscribable with a method subscribe.

import java.util.Date;
import java.util.Scanner;

// Interface for subscribing to the plans
interface Subscribable {
    void subscribe();
}

class WorkoutPlan {
    String name;
    int id;
    String password;

    WorkoutPlan(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    void updatePassword(String new_password) {
        this.password = new_password;
    }
}

class WeightLossPlan extends WorkoutPlan implements Subscribable {
    String target;
    int days;
    Date start;
    Date end;

    WeightLossPlan(String name, int id, String password, String target, int days, Date start, Date end) {
        super(name, id, password);
        this.target = target;
        this.days = days;
        this.start = start;
        this.end = end;
    }

    void remind(int how_many_times_to_remind) {
        for (int i = 0; i < how_many_times_to_remind; i++) {
            System.out.println("Reminder: Do some walking, it's been a while!");
            try {
                Thread.sleep(600); // Short delay between reminders
            } catch (InterruptedException e) {
                System.out.println("Error in reminder");
            }
        }
    }

    void report() {
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t Let's assess your progress!");
        System.out.print("What was your weight before (kg): ");
        int before = s.nextInt();
        System.out.print("What is your weight now (kg): ");
        int after = s.nextInt();

        if (before > after) {
            System.out.println("Congrats! You've lost " + (before - after) + " kg.");
        } else if (after > before) {
            System.out.println("It seems you've gained " + (after - before) + " kg. Keep an eye on your diet!");
        } else {
            System.out.println("No changes in weight.");
        }

        System.out.println("\t\t Report: ");
        System.out.println("\t Before weight: " + before + "kg");
        System.out.println("\t After weight: " + after + "kg");
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to Weight Loss Plan!");
    }
}

// MuscleGainPlan class extending WorkoutPlan and implementing Subscribable interface
class MuscleGainPlan extends WorkoutPlan implements Subscribable {
    String target;
    int days;
    Date start;
    Date end;

    MuscleGainPlan(String name, int id, String password, String target, int days, Date start, Date end) {
        super(name, id, password);
        this.target = target;
        this.days = days;
        this.start = start;
        this.end = end;
    }

    void remind(int how_many_times_to_remind) {
        for (int i = 0; i < how_many_times_to_remind; i++) {
            System.out.println("Reminder: Time to lift those weights!");
            try {
                Thread.sleep(600); // Short delay between reminders
            } catch (InterruptedException e) {
                System.out.println("Error in reminder");
            }
        }
    }

    void progress() {
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t Let's assess your progress!");
        System.out.print("What was your muscle mass before (kg): ");
        int before = s.nextInt();
        System.out.print("What is your muscle mass now (kg): ");
        int after = s.nextInt();

        if (before < after) {
            System.out.println("Great! You've gained " + (after - before) + " kg of muscle.");
        } else if (after < before) {
            System.out.println("Your muscle mass decreased by " + (before - after) + " kg. Stay consistent!");
        } else {
            System.out.println("No changes in muscle mass.");
        }

        System.out.println("\t\t Report: ");
        System.out.println("\t Before muscle mass: " + before + "kg");
        System.out.println("\t After muscle mass: " + after + "kg");
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to Muscle Gain Plan!");
    }
}

// GeneralFitnessPlan class extending WorkoutPlan and implementing Subscribable interface
class GeneralFitnessPlan extends WorkoutPlan implements Subscribable {
    String goal;
    int days;
    Date start;
    Date end;

    GeneralFitnessPlan(String name, int id, String password, String goal, int days, Date start, Date end) {
        super(name, id, password);
        this.goal = goal;
        this.days = days;
        this.start = start;
        this.end = end;
    }

    void remind(int how_many_times_to_remind) {
        for (int i = 0; i < how_many_times_to_remind; i++) {
            System.out.println("Reminder: Stay active and keep moving!");
            try {
                Thread.sleep(600); // Short delay between reminders
            } catch (InterruptedException e) {
                System.out.println("Error in reminder");
            }
        }
    }

    void overallFitnessReport() {
        System.out.println("Stay fit and healthy! Keep track of your activities and diet.");
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to General Fitness Plan!");
    }
}

// Main class to test the functionality 
class Online_Fitness_Program{
    public static void main(String[] args) {
        // Sample date values (for simplicity)
        Date startDate = new Date();
        Date endDate = new Date(startDate.getTime() + 86400000L * 30); // 30 days later

        // Creating and subscribing to different plans
        WeightLossPlan weightLoss = new WeightLossPlan("John", 101, "pass123", "Lose 5 kg", 30, startDate, endDate);
        MuscleGainPlan muscleGain = new MuscleGainPlan("Emily", 102, "gain456", "Gain 3 kg muscle", 45, startDate, endDate);
        GeneralFitnessPlan generalFitness = new GeneralFitnessPlan("Alex", 103, "fit789", "Stay active", 60, startDate, endDate);

        weightLoss.subscribe();
        muscleGain.subscribe();
        generalFitness.subscribe();

        // Showing progress reports
        weightLoss.report();
        muscleGain.progress();
        generalFitness.overallFitnessReport();

        // Reminder functionality
        weightLoss.remind(1);
        muscleGain.remind(1);
        generalFitness.remind(1);
    }
}
