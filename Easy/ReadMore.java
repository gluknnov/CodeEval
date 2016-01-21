import java.io.*;

public class Main {
    public static String solve(String input) {
        if(input.length() <= 55) {
            return input;
        }

        String shortLine = input.substring(0, 40);
        if(shortLine.contains(" ")) {
            shortLine = shortLine.substring(0, shortLine.lastIndexOf(' '));
        }

        return shortLine + "... <Read More>";
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
