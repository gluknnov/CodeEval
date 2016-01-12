import java.io.*;
import java.util.HashMap;

public class Main {
    public static String solve(String input) {
        HashMap<String, Integer> numberStringsMap = new HashMap<>();
        String[] numberStrings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(Integer i = 0; i < numberStrings.length; i++) {
            numberStringsMap.put(numberStrings[i], i);
        }
        String[] numbers = input.split(";");

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numbers.length; i++) {
            result.append(numberStringsMap.get(numbers[i]));
        }

        return result.toString();
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
