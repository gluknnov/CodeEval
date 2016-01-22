import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            int wordLenght = word.length();
            result.append(word.charAt(wordLenght - 1)).append(word.substring(1, wordLenght - 1)).append(word.charAt(0)).append(" ");
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
