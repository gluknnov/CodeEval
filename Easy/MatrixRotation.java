import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] matrix = input.split(" ");
        Integer n = (int)Math.sqrt(matrix.length);
        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < n; i++) {
            for(Integer j = 0; j < n; j++) {
                result.append(matrix[n*n - (n-i) - j*n]).append(" ");
            }
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
