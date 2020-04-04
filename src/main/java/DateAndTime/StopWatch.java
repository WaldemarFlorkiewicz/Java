package DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to start stopwatch.");
        scanner.nextLine();
        LocalTime s1 = LocalTime.now();
        System.out.println("StopWatch START");
        System.out.println();
        System.out.println("Press ENTER to stop stopwatch.");
        scanner.nextLine();
        LocalTime s2 = LocalTime.now();
        System.out.println("StopWatch STOP");
        Duration between = Duration.between(s1, s2);
        System.out.println("Passed in: " + between.getSeconds() + " seconds" );
        scanner.close();


    }


}
