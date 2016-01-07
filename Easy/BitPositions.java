import java.io.*;
public class Main {
    public static String solve(String input) {
        String[] args = input.split(",");
        Integer n = Integer.parseInt(args[0]);
        Integer p1 = Integer.parseInt(args[1]);
        Integer p2 = Integer.parseInt(args[2]);

        Integer b1 = getBitValue(n, p1);
        Integer b2 = getBitValue(n, p2);
        return Boolean.toString(b1.equals(b2));
    }

    private static Integer getBitValue(Integer number, Integer bitNumber) {
        for(Integer i = 1; i < bitNumber; i++) {
            number /= 2;
        }

        return number % 2;
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
