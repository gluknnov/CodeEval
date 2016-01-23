import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] elements = input.split(" ");
        Integer mth = (elements.length - 1) - Integer.parseInt(elements[elements.length - 1]);

        return mth >= 0 ? elements[mth] : "";
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
