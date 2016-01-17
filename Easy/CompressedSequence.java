import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] numbers = input.split(" ");
        StringBuilder result = new StringBuilder();
        
        Integer prevNumber = Integer.parseInt(numbers[0]);
        Integer prevNumberCount = 0;
        for (String number : numbers) {
            Integer currentNumber = Integer.parseInt(number);
            if (prevNumber.equals(currentNumber)) {
                prevNumberCount++;
            } else {
                result.append(prevNumberCount).append(" ").append(prevNumber).append(" ");
                prevNumber = currentNumber;
                prevNumberCount = 1;
            }
        }
        result.append(prevNumberCount).append(" ").append(prevNumber).append(" ");

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
