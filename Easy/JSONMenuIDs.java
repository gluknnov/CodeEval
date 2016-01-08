import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String solve(String input) {
        Integer sum = 0;
        Pattern idWithLabelPattern = Pattern.compile("\"id\": *(\\d+), *\"label\"");
        Matcher idWithLabelMatcher = idWithLabelPattern.matcher(input);
        while (idWithLabelMatcher.find()) {
            sum += Integer.parseInt(idWithLabelMatcher.group(1));
        }

        return sum.toString();
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
