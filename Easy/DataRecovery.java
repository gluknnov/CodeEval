import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(";");
        String[] words = args[0].split(" ");
        String[] orderString = args[1].split(" ");
        Integer[] order = new Integer[orderString.length];
        for(Integer i = 0; i < orderString.length; i++) {
            order[i] = Integer.parseInt(orderString[i]);
        }

        String[] reorderedWords = new String[words.length];
        for(Integer i = 0; i < order.length; i++) {
            reorderedWords[order[i] - 1] = words[i];
        }
        for(Integer i = 0; i < reorderedWords.length; i++) {
            if(reorderedWords[i] == null) {
                reorderedWords[i] = words[words.length - 1];
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (String reorderedWord : reorderedWords) {
            result.append(reorderedWord).append(" ");
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
