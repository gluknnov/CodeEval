import java.io.*;

public class Main {
    public static String solve(String input) {
        double value = Double.parseDouble(input);
        int integerPart = (int)value;
        value -= integerPart;
        int minutes = (int)(value * 60.0);
        value -= (1.0 / 60.0) * minutes;
        int seconds = (int)(value * 3600.0);

        return String.format("%d.%02d'%02d\"", integerPart, minutes, seconds);
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
