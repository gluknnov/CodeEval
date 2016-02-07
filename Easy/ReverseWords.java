import java.io.*;

public class Main {
    public static String reverse(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder("");
        for (Integer i = words.length -1; i >= 0; i--) {
            result.append(words[i]);
            if(i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(reverse(line));
        }
    }
}
