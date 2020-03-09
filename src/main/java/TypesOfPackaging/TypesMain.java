package TypesOfPackaging;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TypesMain {
    public static void main(String[] args) throws IOException {
        String fileName = "numbers.txt";
        File file = new File(fileName);
        boolean exists = file.exists();


        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        if (!exists) {
            file.createNewFile();
        }

        bufferedWriter.write("123");
        bufferedWriter.newLine();
        bufferedWriter.write("1234");
        bufferedWriter.newLine();
        bufferedWriter.write("12345");
        bufferedWriter.newLine();
        bufferedWriter.write("123456789123456789");
        bufferedWriter.newLine();
        bufferedWriter.write("987654321987654321");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        int sum = 0;
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int number3 = Integer.parseInt(bufferedReader.readLine());
        sum = number1 + number2 + number3;
        BigInteger bigInteger = new BigInteger(bufferedReader.readLine());
        BigInteger bigInteger2 = new BigInteger(bufferedReader.readLine());
        BigInteger add = bigInteger.add(bigInteger2);


        System.out.println(add);
        System.out.println(sum);


    }


}
