import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] words = input.split(" ");
        Integer longest = 0;
        for(Integer i = 1; i < words.length; i++) {
            if(words[longest].length() < words[i].length()) {
                longest = i;
            }
        }

        return words[longest];
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
