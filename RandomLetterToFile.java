// import java.util.Random;
// import java.util.concurrent.Executors;
// import java.util.concurrent.ScheduledExecutorService;
// import java.util.concurrent.TimeUnit;

// public class KeyTyping {
//     public static void main(String[] args) {
//         // Create a Random object for generating random letters
//         Random random = new Random();

//         // Create a ScheduledExecutorService to run the task periodically
//         ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

//         Runnable typeRandomLetter = () -> {
//             // Generate a random letter (A-Z or a-z)
//             char randomLetter = (char) (random.nextInt(26) + (random.nextBoolean() ? 'A' : 'a'));
//             System.out.print(randomLetter + " ");
//         };

//         // Schedule the task to run every 1 second
//         scheduler.scheduleAtFixedRate(typeRandomLetter, 0, 1, TimeUnit.SECONDS);

//         // Shutdown the program gracefully after a set time (optional)
//         // Uncomment the lines below to stop after 30 seconds, for example.
//         // scheduler.schedule(() -> {
//         //     scheduler.shutdown();
//         //     System.out.println("\nProgram terminated.");
//         // }, 30, TimeUnit.SECONDS);
//     }
// }

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RandomLetterToFile {
    public static void main(String[] args) {
        // File path where the letters will be written
        String filePath = "D:\\JAVA+DSA\\random_letters.txt";

        // Create a Random object for generating random letters
        Random random = new Random();

        // Create a ScheduledExecutorService to run the task periodically
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Task to write random letters to the file
        Runnable writeRandomLetter = () -> {
            try (FileWriter writer = new FileWriter(filePath, true)) {
                // Generate a random letter (A-Z or a-z)
                char randomLetter = (char) (random.nextInt(26) + (random.nextBoolean() ? 'A' : 'a'));
                writer.write(randomLetter + " ");
                // System.out.println("Written: " + randomLetter); // Optional log to terminal
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
                scheduler.shutdown(); // Stop the scheduler if an error occurs
            }
        };

        // Schedule the task to run every 1 second
        scheduler.scheduleAtFixedRate(writeRandomLetter, 0, 1, TimeUnit.SECONDS);

        // Optional: Stop the program gracefully after a certain period (e.g., 30 seconds)
        // scheduler.schedule(() -> {
        //     scheduler.shutdown();
        //     System.out.println("\nProgram terminated.");
        // }, 30, TimeUnit.SECONDS);
    }
}
