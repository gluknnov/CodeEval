import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String solve(String input) {
        String[] numbers = input.split(",");
        HashMap<String, Integer> numbersCount = new HashMap<>();
        for (String number : numbers) {
            Integer count = (numbersCount.containsKey(number)) ? numbersCount.get(number) : 0;
            numbersCount.put(number, count + 1);
        }

        for (Map.Entry<String, Integer> pair : numbersCount.entrySet()) {
            if (pair.getValue() > numbers.length / 2) {
                return pair.getKey();
            }
        }

        return "None";
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
