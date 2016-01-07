import java.io.*;
public class Main {
    public static String solve(String input) {
        StringBuilder result = new StringBuilder();

        for(Integer i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            if(letter >= 'A' && letter <= 'Z') {
                letter -= 'A' - 'a';
            }

            result.append(letter);
        }

        return result.toString();
    }
    
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // We can use line.toLowerCase(), but in my mind this task is not about that
            System.out.println(solve(line));
        }
    }
}
