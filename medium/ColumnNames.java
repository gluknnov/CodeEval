import java.io.*;

public class Main {
    public static String solve(String input) {
        Integer number = Integer.parseInt(input) - 1;
        StringBuilder result = new StringBuilder();
        for(Integer i = 1, base = 26; i <= 3; i++, base *= 26) {
            if(number < base) {
                for(Integer j = 0; j < i; j++) {
                    result.append((char) ('A' + (number % 26)));
                    number /= 26;
                }
                break;
            }
            else {
                number -= base;
            }
        }

        return result.reverse().toString();
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
