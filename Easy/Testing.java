import java.io.*;

public class Main {
    private static String[] statuses = {"Done", "Low", "Medium", "High", "Critical"};
    private static Integer[] bugsCounts = {0, 2, 4, 6, Integer.MAX_VALUE};

    public static String solve(String input) {
        String[] args = input.split("\\|");
        String actual = args[0].trim();
        String expected = args[1].trim();
        Integer bugsCount = 0;
        for(Integer i = 0; i < expected.length(); i++) {
            if(actual.charAt(i) != expected.charAt(i)) {
                bugsCount++;
            }
        }

        for(Integer i = 0; i < bugsCounts.length; i++) {
            if(bugsCount <= bugsCounts[i]) {
                return statuses[i];
            }
        }

        return statuses[statuses.length - 1];
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
