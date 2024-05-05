import java.io.IOException;

public class txttospeech {
    public static void main(String[] args) {
        try {
            // Text to be spoken
            String text = "Hello, how are you?";

            // Command to speak the text using 'say' command on macOS
            String[] command = {"say", text};

            // Execute the command
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // Wait for the process to finish
            process.waitFor();

            System.out.println("Speech finished.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
