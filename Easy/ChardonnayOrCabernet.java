import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split("\\|");
        String[] wines = args[0].trim().split(" ");
        String letters = args[1].trim();
        StringBuilder result = new StringBuilder();
        for (String wine : wines) {
            String word = wine;
            boolean allFound = true;
            for (Integer j = 0; j < letters.length(); j++) {
                String c = String.valueOf(letters.charAt(j));
                if(word.contains(c)) {
                    word = word.replaceFirst(c, "");
                }
                else {
                    allFound = false;
                    break;
                }
            }

            if (allFound) {
                result.append(wine).append(" ");
            }
        }

        return result.length() > 0 ? result.deleteCharAt(result.length() - 1).toString() : "False";
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
