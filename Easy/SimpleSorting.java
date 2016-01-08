import java.io.*;
import java.util.TreeSet;

public class Main {
    public static String solve(String input) {
        String[] valuesString = input.split(" ");
        StringBuilder result = new StringBuilder();
        TreeSet<Double> sortedArray = new TreeSet<>();
        for (String valueString : valuesString) {
            sortedArray.add(Double.parseDouble(valueString));
        }

        for (Double sortedArrayElem : sortedArray) {
            result.append(String.format("%.3f", sortedArrayElem)).append(" ");
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
