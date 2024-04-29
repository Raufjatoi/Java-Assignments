package assi2_of_lab_uni;

//Traffic Light Simulator (if-else): Imagine you're coding a traffic light system. Write code
//using if-else statements to control the lights (red, yellow, green) based on a color input
//suggest message (Ruk Ja, Tyari Kar le, Chal Nikal).

import java.util.Scanner;

public class prb1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\t Traffic Light simulator 🚦");

        System.out.print("Enter the light 🟢🟡🔴 : ");
        String light = in.nextLine();

        if (light.equalsIgnoreCase("Red")){
            System.out.println("Traffic Light is red 🔴");
            System.out.println("\t R U K   J A A 🤚✋");
        }
        else if (light.equalsIgnoreCase("yellow")){
            System.out.println("Traffic Light is Yellow 🟡");
            System.out.println("\t T Y A R I  K A R 🙂🙂");
        }
        else if (light.equalsIgnoreCase("green")){
            System.out.println("Traffic Light is Green 🟢 ");
            System.out.println("\t C H A L  N I K A L 🤗🤗");
        }
        else {
            System.out.println("T R Y  A G A I N 🥲");
            System.out.println("THE SYSTEM DIDNT FOUND THA COLOR , MAYBE A NEW COLOR 🙂🙂🙂🙂🙂");
            in.close();
        }
    }
}

