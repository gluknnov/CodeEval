import java.io.*;
public class Main {
    public static String solve(String input) {
        String[] args = input.split(",");
        String S = args[0];
        char t = args[1].charAt(0);

        for(Integer i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) == t) {
                return i.toString();
            }
        }

        return "-1";
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
