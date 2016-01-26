import java.io.*;

public class Main {
    public static String solve(String input) {
        Long number = Long.parseLong(input);
        for(Integer i = 0; i <= 100; i++) {
            if(isPalindrome(number)) {
                return String.format("%d %d", i, number);
            }
            number += reverse(number);
        }

        return "No solution found";
    }

    private static boolean isPalindrome(Long number) {
        return number.equals(reverse(number));
    }

    private static Long reverse(Long number) {
        Long result = 0L;
        while (number > 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }

        return result;
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
