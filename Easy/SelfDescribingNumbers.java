import java.io.*;
public class Main {
    public static String solve(String input) {
        for(Integer i = 0; i < input.length(); i++) {
            Integer expectedCount = input.charAt(i) - '0';
            Integer actualCount = getDigitCount(input, i);
            if(!expectedCount.equals(actualCount)) {
                return "0";
            }
        }

        return "1";
    }

    private static Integer getDigitCount(String input, Integer digit) {
        Integer count = 0;

        for(Integer i = 0; i < input.length(); i++) {
            if(input.charAt(i) - '0' == digit) {
                count++;
            }
        }

        return count;
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
