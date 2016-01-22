import java.io.*;
import java.util.Arrays;

public class Main {
    public static String solve(String input) {
        String[] houseNumbersString = input.split(" ");
        Integer[] houseNumbers = new Integer[houseNumbersString.length - 1];
        for(Integer i = 1; i < houseNumbersString.length; i++) {
            houseNumbers[i - 1] = Integer.parseInt(houseNumbersString[i]);
        }
        Arrays.sort(houseNumbers);

        Integer averageNumber = houseNumbers[houseNumbers.length / 2];
        Integer distance = 0;
        for (Integer houseNumber : houseNumbers) {
            distance += Math.abs(averageNumber - houseNumber);
        }

        return distance.toString();
    }
    
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(solve(line));
        }
    }
}
