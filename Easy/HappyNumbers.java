import java.io.*;
import java.util.ArrayList;

public class Main {
    public static String solve(String input) {
        Integer number = Integer.parseInt(input);
        ArrayList<Integer> generatedNumbers = new ArrayList<>();

        while ((!isHappy(number)) && (!generatedNumbers.contains(number))) {
            generatedNumbers.add(number);
            number = getNextNumber(number);
        }

        return isHappy(number) ? "1" : "0";
    }

    private static Integer getNextNumber(Integer number) {
        Integer sum = 0;
        while (number > 0) {
            sum += (number % 10) * (number % 10);
            number /= 10;
        }
        
        return sum;
    }

    private static boolean isHappy(Integer number) {
        return number.equals(1);
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
