import java.io.*;
public class Main {
    public static String solve(String input) {
        return getFibonacci(Integer.parseInt(input)).toString();
    }

    private static Integer getFibonacci(Integer number) {
        if(number.equals(0)) return 0;
        if(number.equals(1)) return 1;
        return getFibonacci(number - 1) + getFibonacci(number - 2);
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
