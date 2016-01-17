import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(" ");

        char operation = args[1].contains("+") ? '+' : '-';
        Integer operationPosition = args[1].indexOf(operation);

        Integer firstNumber = Integer.parseInt(args[0].substring(0, operationPosition));
        Integer secondNumber = Integer.parseInt(args[0].substring(operationPosition));

        return String.valueOf((operation == '+') ? firstNumber + secondNumber : firstNumber - secondNumber);
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
