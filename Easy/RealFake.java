import java.io.*;

public class Main {
    public static String solve(String input) {
        String number = input.replace(" ", "");
        Integer sum = 0;
        for(Integer i = 0; i < number.length(); i++) {
            Integer digit = number.charAt(i) - '0';
            if(i % 2 == 0) {
                sum += digit;
            }
            sum += digit;
        }

        return (sum % 10 == 0) ? "Real" : "Fake";
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
