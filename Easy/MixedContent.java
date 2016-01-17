import java.io.*;
import java.util.ArrayList;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(",");
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> digits = new ArrayList<>();

        for (String arg : args) {
            if (arg.matches("[-]?\\d+")) {
                digits.add(arg);
            } else {
                words.add(arg);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            result.append(words.get(i));
            if(i < words.size() - 1) {
                result.append(",");
            }
        }
        if((digits.size() != 0 ) && (words.size() != 0)) {
            result.append("|");
        }
        for (int i = 0; i < digits.size(); i++) {
            result.append(digits.get(i));
            if(i < digits.size() - 1) {
                result.append(",");
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
