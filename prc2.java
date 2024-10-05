class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    String getName() {
        return this.name;
    }

    // Getter for age
    int getAge() {
        return this.age;
    }

    // Method to check voting eligibility
    boolean isEligibleToVote() {
        return this.age >= 18;  // Directly return the boolean expression
    }
}

class Prc2 {
    public static void main(String[] args) {
        Person rauf = new Person("Abdul Rauf", 20);
        Person umar = new Person("Muhammad Umar", 17); // Added missing semicolon

        // Check eligibility to vote
        System.out.println(rauf.getName() + " is eligible to vote: " + rauf.isEligibleToVote());
        System.out.println(umar.getName() + " is eligible to vote: " + umar.isEligibleToVote());
    }
}
