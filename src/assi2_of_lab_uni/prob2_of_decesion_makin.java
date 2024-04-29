package assi2_of_lab_uni;

//Movie Recommendation System (if-else/switch): Create a program that suggests movies based on a user's age. Use if-else or
//switch statements to handle different age groups and recommend appropriate genres (comedy for kids, action for teens, etc.).

import java.util.Scanner;

public class prob2_of_decesion_makin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\t MOvie ReCoMmEnDatIoN SyStEm 🎬");
        System.out.print("Enter ya Age first 🤨 : ");
        int age = in.nextInt();
        if (age >= 10 && age <= 17 ){
            System.out.println("\t\t hey kiddo , you can Try some comedy movies like : ");
            System.out.println("\t 1: Kungfu Panda 🐼");
            System.out.println("\t 2: Luca 🐡");
            System.out.println("\t 3: Mario 💢");

        }
        else if (age >= 18 && age <= 24){
            System.out.println("\t\t hey teeno , you can try some mens stuffs like : ");
            System.out.println("\t 1: GODFATHER 🚬");
            System.out.println("\t 2: BLADE RUNNER 🏃‍♂️🥈");
            System.out.println("\t 3: AMERICAN PSYCO 👦");
            System.out.println("\t 4: WHEATHERING WITH U 🌧️ (ITS A ANIME ) 🤩");
            System.out.println("\t 5: THE BATMAN 2022 🦇");
        }
        else if (age >= 25 && age <= 30){
            System.out.println("\t\t so finall 'A MEN ❤️‍🩹' hmm so u maybe findin some meaning of life right , try these seq : " );
            System.out.println("\t 1: MATRIX ✖️");
            System.out.println("\t 2: SHAWSHANK REDEPTION 🚨");
            System.out.println("\t 3: SPACE ODSSY 🌌");
            System.out.println("\t 4: WIND RISES 🍃 ( A beautiful anime )");
            System.out.println("\t 5: EVERYTHIN EVERYWHERE ALL AT ONCE ❌");


        }
        else if (age >= 30 && age <= 40 ){

            System.out.println("\t\t WELL U CAN LITREALLY WATCH ANYTHIN U LIKE FROM ABOVE ONES ");
            System.out.println("\t >> Check the movies rec of 25 to 29 tha muchs urs too , but dont cry here are few : ");
            System.out.println("\t 0: PARASITE 🪱 (KOREAN ONE  ) ");
            System.out.println("\t 1: Watch all the marvels , dc and batmannnnnnnnnnnn 🦇 ");
            System.out.println("\t 2: WATCH ALL THE MARVELS ");
            System.out.println("\t 3: WATCH ALL THE DCS ");
        }
        else if (age >= 40){
            System.out.println("\t\t HOW WAS THE LIFE UNCLE , well enjoy ur time u have alot noe and happy dieing 🙂");
            System.out.println("\t Lifes so beautiful right , but its short too ❤️‍🩹❤️‍🩹");
            System.out.println("\t 1: WATCH ALL THE LIFES on discovery ig  🧬🐘🦌🫎 ");
            System.out.println("\t 2: FOREST GUMP 🥱  ");
            System.out.println("THE ENND 🔚");



        }
        in.close();
    }

}
