import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split("\\|");
        String[] numbersString = args[0].trim().split(" ");
        Integer iterationsNum = Integer.parseInt(args[1].trim());
        Integer[] numbers = new Integer[numbersString.length];
        for(Integer i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        for(Integer i = 0; i < iterationsNum; i++) {
            for(Integer j = 1; j < numbers.length; j++) {
                if(numbers[j - 1] > numbers[j]) {
                    Integer tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (Integer number : numbers) {
            result.append(number).append(" ");
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
