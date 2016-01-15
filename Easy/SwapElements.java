import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(":");
        String[] numbers = args[0].trim().split(" ");
        String[] swaps = args[1].trim().split(", ");
        for (String swap : swaps) {
            String[] swapArgs = swap.split("-");
            String tmp = numbers[Integer.parseInt(swapArgs[0])];
            numbers[Integer.parseInt(swapArgs[0])] = numbers[Integer.parseInt(swapArgs[1])];
            numbers[Integer.parseInt(swapArgs[1])] = tmp;
        }

        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if(i != numbers.length - 1) {
                result.append(" ");
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
