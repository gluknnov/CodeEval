import java.io.*;
public class Main {
    public static String solve(String input) {
        for(Integer i = Integer.parseInt(input) - 1; i >= 0; i--) {
            if(isPrime(i) && isPalindrome(i)) {
                return i.toString();
            }
        }

        return "1";
    }

    private static boolean isPalindrome(Integer number) {
        String numberString = number.toString();
        for(Integer i = 0; i < numberString.length() / 2; i++) {
            if(numberString.charAt(i) != numberString.charAt((numberString.length() - 1) - i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrime(Integer number) {
        for(Integer i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void main (String[] args) throws IOException {
        //File file = new File(args[0]);
        //BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        //while ((line = buffer.readLine()) != null) {
            line = "1000";
            System.out.println(solve(line));
        //}
    }
}
