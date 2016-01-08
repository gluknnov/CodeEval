import java.io.*;
public class Main {
    public static String solve(String input) {
        Integer result = 0;
        Integer weight = 1;

        for(Integer i = input.length() - 1; i >= 0; i--) {
            Integer digit;
            if(input.charAt(i) > '9') {
                digit = input.charAt(i) - 'a' + 10;
            }
            else {
                digit = input.charAt(i) - '0';
            }
            result += digit * weight;
            weight *= 16;
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
