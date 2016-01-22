import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(" ");
        Integer zeroCount = Integer.parseInt(args[0]);
        Integer max = Integer.parseInt(args[1]);
        Integer foundCount = 0;
        for(Integer i = 0; i <= max; i++) {
            if(calculateZeroCounts(i).equals(zeroCount)) {
                foundCount++;
            }
        }

        return foundCount.toString();
    }

    private static Integer calculateZeroCounts(Integer value) {
        Integer zeroCount = 0;
        while (value > 0) {
            if (value % 2 == 0) {
                zeroCount++;
            }
            value /= 2;
        }

        return zeroCount;
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
