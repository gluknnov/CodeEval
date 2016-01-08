import java.io.*;
public class Main {
    public static String solve(String input) {
        String[] args = input.split(",");
        Integer N = Integer.parseInt(args[0]);
        Integer M = Integer.parseInt(args[1]);
        return Integer.valueOf(N - ((N / M) * M)).toString();
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
