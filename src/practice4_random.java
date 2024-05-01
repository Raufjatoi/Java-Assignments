import java.util.Random;

public class practice4_random {
    public static void main(String[] args ){
        Random r = new Random();
        char[] options = {'r', 's', 'p'};
        char cmov = options[r.nextInt(options.length)];
        System.out.println("Randomly selected: " + cmov);
    }
}
