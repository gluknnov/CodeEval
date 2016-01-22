import java.io.*;
import java.util.Arrays;

public class Main {
    public static String solve(String input) {
        String[] timesString = input.split(" ");
        Arrays.sort(timesString);

        StringBuilder result = new StringBuilder();
        for(Integer i = timesString.length - 1; i >= 0; i--) {
            result.append(timesString[i]).append(" ");
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
