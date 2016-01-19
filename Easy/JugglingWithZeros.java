import java.io.*;

public class Main {
    public static String solve(String input) {
        Long number = 0L;
        String[] numberParts = input.split(" ");
        for(Integer i = 0; i < numberParts.length; i += 2) {
            number <<= numberParts[i+1].length();
            if (numberParts[i].length() == 2) {
                number += (1 << numberParts[i+1].length()) - 1;
            }
        }

        return number.toString();
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
