import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] words = input.split(" ");

        return words[words.length - 2];
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
