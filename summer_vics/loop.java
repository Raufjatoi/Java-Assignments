package summer_vics;

/*
 *    # # 
 *   ## ##
 *  ### ###
 * #### ####
 */ 

public class loop {
    public static void main(String[] args) {

        int h = 10;

        for (int i = 1; i <= h; i++){
            for (int j=0; j < h - i ; j++){
                System.out.print(" ");
            }
            for (int j=0; j < i; j++){
                System.out.print("#");
            }
            System.out.print(" ");
            for (int j=0 ; j < i ; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        
    }

    
} 