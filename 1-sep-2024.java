//26. Job Recruitment System
// Scenario: Develop a job recruitment system where companies can post job openings and candidates can apply.
// Jobs have titles, descriptions, and requirements.
// Concepts: Classes, Inheritance, ArrayList
// Task: Create a Job class and a Candidate class. Implement methods to apply for jobs and display job details.
import java.util.ArrayList;
class Job {
    String title;
    String description;
    String requirements;
    Job(String title, String description , String requirements){
        this.title = title;
        this.description = description;
        this.requirements = requirements;
    }
    String getTitle (){
        return title;
    }
    String getDescription(){
        return description;
    }
    String getRequirements(){
        return requirements;
    }
    void details(Job j){
        System.out.println("job title : " + j.title + "\n Job description : " + j.description + "\n job requirements : " + j.requirements);
    }
    void apply(Candidate c , Job j){
        if (c.Degree == j.requirements){
            System.out.println("ur application is apllied");
        }
        else{
            System.out.println("didnt matched the requirements");
        }

    }
}
class Candidate {
    String name;
    String Degree;
    ArrayList<Job> jobs;
    Candidate(String name, String Degree){
        this.name = name;
        this.Degree = Degree;
        this.jobs = new ArrayList<Job>();
    }

}
class JobRecruitmentSystem{
    public static void main(String[] args) {
        Job j1 = new Job("Ai engineer ", "an ai engineer", "BSAI");
        Job j3 = new Job("data analyst ", "needed a data analyst ", "BSDS");

        Candidate c1 = new Candidate("Rauf", "BSAI");
        Candidate c2 = new Candidate("Adil", "BME");

        j1.apply(c1, j1);
        j3.apply(c2,j3);
    }
}