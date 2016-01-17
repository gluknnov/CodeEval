import java.io.*;

public class Main {
    public static String solve(String input) {
        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < input.length(); i++) {
            if((input.charAt(i) >= 'a') && (input.charAt(i) <= 'j')) {
                result.append(input.charAt(i) - 'a');
            }
            else if ((input.charAt(i) >= '0') && (input.charAt(i) <= '9')) {
                result.append(input.charAt(i));
            }
        }

        return result.length() > 0 ? result.toString() : "NONE";
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
