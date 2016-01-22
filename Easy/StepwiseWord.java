import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] words = input.split(" ");
        Integer longestWordNum = 0;
        for(Integer i = 0; i < words.length; i++) {
            if(words[longestWordNum].length() < words[i].length()) {
                longestWordNum = i;
            }
        }

        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < words[longestWordNum].length(); i++) {
            for(Integer j = 0; j < i; j++) {
                result.append("*");
            }
            result.append(words[longestWordNum].charAt(i)).append(" ");
        }

        return result.deleteCharAt(result.length() - 1).toString();
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
