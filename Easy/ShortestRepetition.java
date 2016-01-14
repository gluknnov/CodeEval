import java.io.*;

public class Main {
    public static String solve(String input) {
        for(Integer period = 1; period < input.length() / 2; period++) {
            if(input.substring(0, period).contentEquals(input.substring(period, (period + period)))) {
                return period.toString();
            }
        }

        return String.valueOf(input.length());
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
