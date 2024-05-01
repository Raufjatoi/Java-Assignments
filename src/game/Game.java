package game;

import java.util.*;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("\t\t\t ROCK 🪨 PAPER 📃 SCISSOR ✂️ GAME");
            System.out.println("\t Enter q to quite the game");
            System.out.print("ENTER UR MOV like R=🪨 / P=📃 / S=✂️: ");
            char pmov = in.next().charAt(0);
            Random r = new Random();
            char[] options = {'r', 's', 'p'};
            char cmov = options[r.nextInt(options.length)];
            if (cmov == 'r' && pmov == 'p') {
                System.out.println("Player won 🎉");
            }
            else if (cmov == 'r' && pmov == 's') {
                System.out.println("Computer won 🥺");
            }
            else if (cmov ==  pmov) {
                System.out.println("Its a draw 📍");
            }
            else if (cmov == 'p' && pmov == 's') {
                System.out.println("Player won 🎉");
            }
            else if (cmov == 'p' && pmov == 'r') {
                System.out.println("Computer won 🥺");
            }
            else if (cmov == 's' && pmov == 'p') {
                System.out.println("Computer won 🥺");
            }
            else if (cmov == 's' && pmov == 'r') {
                System.out.println("Player won 🎉");
            }
            else if (pmov == 'q') {
                System.exit(0);
            }
            else {
                System.out.println("Wrong option");
            }
        }




    }

    }
