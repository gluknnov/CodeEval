import java.io.*;

public class Main {
    public static String solve(String input) {
        Integer lowercase = 0;
        Integer uppercase = 0;
        for(Integer i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if((c >= 'a') && (c <= 'z')) {
                lowercase++;
            }
            if((c >= 'A') && (c <= 'Z')) {
                uppercase++;
            }
        }

        return String.format("lowercase: %.2f uppercase: %.2f", 100.0 * lowercase / (lowercase + uppercase), 100.0 * uppercase / (lowercase + uppercase));
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
