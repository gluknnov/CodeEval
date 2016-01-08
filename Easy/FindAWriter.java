import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split("\\|");
        String encodedName = args[0];
        String[] keys = args[1].trim().split(" ");
        StringBuilder result = new StringBuilder();

        for(Integer i = 0; i < keys.length; i++) {
            result.append(encodedName.charAt(Integer.parseInt(keys[i]) - 1));
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
