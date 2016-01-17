import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String solve(String input) {
        Map<String, Character> morseCodes = Collections.unmodifiableMap(new HashMap<String, Character>() {{
            put(".-", 'A');
            put("-...", 'B');
            put("-.-.", 'C');
            put("-..", 'D');
            put(".", 'E');
            put("..-.", 'F');
            put("--.", 'G');
            put("....", 'H');
            put("..", 'I');
            put(".---", 'J');
            put("-.-", 'K');
            put(".-..", 'L');
            put("--", 'M');
            put("-.", 'N');
            put("---", 'O');
            put(".--.", 'P');
            put("--.-", 'Q');
            put(".-.", 'R');
            put("...", 'S');
            put("-", 'T');
            put("..-", 'U');
            put("...-", 'V');
            put(".--", 'W');
            put("-..-", 'X');
            put("-.--", 'Y');
            put("--..", 'Z');
            put("-----", '0');
            put(".----", '1');
            put("..---", '2');
            put("...--", '3');
            put("....-", '4');
            put(".....", '5');
            put("-....", '6');
            put("--...", '7');
            put("---..", '8');
            put("----.", '9');
        }});
        String[] words = input.split("  ");
        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < words.length; i++) {
            String[] letters = words[i].split(" ");
            for (String letter : letters) {
                result.append(morseCodes.get(letter));
            }

            if(i < words.length - 1) {
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
            System.out.println(solve(line));
        }
    }
}
