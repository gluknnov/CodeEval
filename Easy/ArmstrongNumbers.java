import java.io.*;
public class Main {
    public static String solve(String input) {
        Integer powExponent = input.length();
        Long sum = 0L;
        for(Integer i = 0; i < input.length(); i++) {
            sum += Math.round(Math.pow(input.charAt(i) - '0', powExponent));
        }

        return (sum.equals(Long.parseLong(input))) ? "True" : "False";
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
