import java.io.*;

public class Main {
    public static String solve(String input) {
        StringBuilder result = new StringBuilder();
        char prevChar = (char) (input.charAt(0) + 1);
        for(Integer i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c != prevChar) {
                result.append(c);
            }

            prevChar = c;
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
