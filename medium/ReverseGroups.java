import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(";");
        String[] numbers = args[0].split(",");
        Integer subListSize = Integer.parseInt(args[1]);
        for(Integer i = 0; i <= numbers.length - subListSize; i += subListSize) {
            reverseSubList(numbers, i, subListSize);
        }

        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(number).append(",");
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }

    private static void reverseSubList(String[] numbers, Integer start, Integer subListSize) {
        for(Integer i = 0; i < subListSize / 2; i++) {
            String tmp = numbers[start + i];
            numbers[start + i] = numbers[(start + subListSize - 1) - i];
            numbers[(start + subListSize - 1) - i] = tmp;
        }
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
