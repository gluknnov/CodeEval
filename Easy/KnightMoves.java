import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String solve(String input) {
        ArrayList<String> result = new ArrayList<>();
        Integer c = input.charAt(0) - 'a';
        Integer n = input.charAt(1) - '1';

        for(Integer i = c - 1; (i <= c + 1); i += 2) {
            for(Integer j = n - 2; (j <= n + 2); j += 4) {
                if((i >= 0) && (i <= 7) && (j >= 0) && (j <= 7)) {
                    result.add(String.format("%c%c", 'a' + i, '1' + j));
                }
            }
        }
        for(Integer i = c - 2; (i <= c + 2); i += 4) {
            for(Integer j = n - 1; (j <= n + 1); j += 2) {
                if((i >= 0) && (i <= 7) && (j >= 0) && (j <= 7)) {
                    result.add(String.format("%c%c", 'a' + i, '1' + j));
                }
            }
        }

        Object[] sortedResults = result.toArray();
        Arrays.sort(sortedResults);
        StringBuilder output = new StringBuilder();
        for (Object sortedResult : sortedResults) {
            output.append(sortedResult).append(" ");
        }

        return output.deleteCharAt(output.length() - 1).toString();
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
