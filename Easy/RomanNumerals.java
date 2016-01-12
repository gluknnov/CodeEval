import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] romanNumbers = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        Integer[] romanValues = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        Integer inputNumber = Integer.parseInt(input);
        StringBuilder result = new StringBuilder();

        while (inputNumber > 0) {
            for (Integer i = romanValues.length - 1; i >= 0; i--) {
                if(inputNumber >= romanValues[i]) {
                    result.append(romanNumbers[i]);
                    inputNumber -= romanValues[i];
                    break;
                }
            }
        }

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
