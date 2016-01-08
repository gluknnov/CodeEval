import java.io.*;

public class Main {
    public static String solve(String input) {
        Integer converValue = 'A' - 'a';
        StringBuilder result = new StringBuilder(input);
        for(Integer i = 0; i < result.length(); i++) {
            char currentLetter = result.charAt(i);
            if((currentLetter >= 'a') && (currentLetter <= 'z')) {
                result.setCharAt(i, (char) (currentLetter + converValue));
            }
            else if((currentLetter >= 'A') && (currentLetter <= 'Z')) {
                result.setCharAt(i, (char) (currentLetter - converValue));
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
            System.out.println(solve(line));
        }
    }
}
