import java.io.*;
import java.util.HashMap;

public class Main {
    public static String solve(String input) {
        String[] numbersString = input.split(" ");
        Integer[] numbers = new Integer[numbersString.length];
        for(Integer i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        HashMap<Integer, Integer> numberPositionMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < numbers.length; i++) {
            if(!numberPositionMap.containsKey(numbers[i])) {
                numberPositionMap.put(numbers[i], i);
            }
            else {
                Integer firstOccurrence = numberPositionMap.get(numbers[i]);
                for(Integer j = firstOccurrence; j < i; j++) {
                    if(numbers[j].equals(numbers[i + (j - firstOccurrence)])) {
                        result.append(numbers[j]).append(" ");
                    }
                }
                break;
            }
        }

        return result.deleteCharAt(result.length() - 1).toString();
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
