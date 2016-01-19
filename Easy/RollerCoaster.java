import java.io.*;

public class Main {
    public static String solve(String input) {
        int loverToUpper = 'A' - 'a';
        boolean toUpper = true;
        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(toUpper) {
                if((c >= 'a') && (c <= 'z')) {
                    c += loverToUpper;
                }
            }
            else {
                if((c >= 'A') && (c <= 'Z')) {
                    c -= loverToUpper;
                }
            }
            result.append(c);

            if(((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))) {
                toUpper = !toUpper;
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
