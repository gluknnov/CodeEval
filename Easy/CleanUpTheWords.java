import java.io.*;

public class Main {
    public static String solve(String input) {
        StringBuilder result = new StringBuilder();
        boolean spaceAdded = false;
        for(Integer i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))) {
                result.append(c);
                spaceAdded = false;
            }
            else {
                if(!spaceAdded) {
                    result.append(" ");
                    spaceAdded = true;
                }
            }
        }

        return result.toString().trim().toLowerCase();
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
