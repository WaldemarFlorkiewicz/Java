package FileOperations;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "File.txt";
        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
        ) {


            String nextLine = null;

            while (((nextLine = bufferedReader.readLine()) != null)) {
                System.out.println(nextLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //File file = new File(fileName);
        //Scanner scanner = null;
        //try {
        //    scanner = new Scanner(file);
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}

        //while (scanner.hasNextLine()) {
        //    String s = scanner.nextLine();
        //    System.out.println(s);
        //}


    }
}
