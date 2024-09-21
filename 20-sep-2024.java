/**48. Online Donation System
Scenario: Create an online donation system where users can donate to different causes.
 Causes can be for Education, Health, or Environment.
Concepts: Classes, Inheritance, Interface
Task: Design a base class Cause and derive EducationCause, HealthCause, and EnvironmentCause classes.
 Implement an interface Donatable with a method makeDonation./**
 */
import java.util.Date;
class Cause {
    String name;
    int amount;
    Date date;
    Cause(String name , int amount , Date date){
        this.name = name;
        this.amount = amount;
        this.date = date;
    }
    void makeDonation(int donation){
        this.amount = donation;
    }
}
class EducationCause extends Cause{
    String type;
    EducationCause(String name , int amount , Date date ){
        super(name, amount, date);
        this.type = "Educational";
    } 
}

class HealthCause extends Cause{
    String type;
    HealthCause(String name , int amount , Date date ){
        super(name, amount, date);
        this.type = "Educational";
    } 
}
class EnvironmentCause extends Cause{
    String type;
    EnvironmentCause(String name , int amount , Date date ){
        super(name, amount, date);
        this.type = "Educational";
    } 
} 
class Online_Donation_System{
    public static void main(String[] args) {
        Date date1 = new Date(2004, 2, 4);
        Date date2 = new Date(2014, 2, 4);
        HealthCause healthCause = new HealthCause("health donation", 1000, null);
        EducationCause educationCause = new EducationCause("educational donation ", 100, date2);
        EnvironmentCause environmentCause = new EnvironmentCause("enviroment cause", 0, date1);

        System.out.println(healthCause.name);
        System.out.println(educationCause.name);
        System.out.println(environmentCause.amount);
        environmentCause.makeDonation(10000);
        System.out.println(environmentCause.amount);



    }
}