import java.io.*;
public class Main {
    public static String solve(String input) {
        String[] numberStrings = input.split(",");
        StringBuilder result = new StringBuilder();
        Integer lastUniqueNumber = -1;

        for(Integer i = 0; i < numberStrings.length; i++) {
            Integer number = Integer.parseInt(numberStrings[i]);
            if(!lastUniqueNumber.equals(number)) {
                lastUniqueNumber = number;
                result.append(lastUniqueNumber).append(",");
            }
        }
        result.deleteCharAt(result.length() - 1);

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
