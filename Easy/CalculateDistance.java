import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.replaceAll("[(),]", "").split(" ");
        Integer x1 = Integer.parseInt(args[0]);
        Integer y1 = Integer.parseInt(args[1]);
        Integer x2 = Integer.parseInt(args[2]);
        Integer y2 = Integer.parseInt(args[3]);

        Long result = Math.round(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));

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
