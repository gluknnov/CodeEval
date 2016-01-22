import java.io.*;

public class Main {
    public static String solve(String input) {
        Integer arrowsCount = 0;
        for(Integer i = 0; i <= input.length() - 5; i++) {
            String testRegion = input.substring(i, i + 5);
            if((testRegion.contentEquals(">>-->")) || (testRegion.contentEquals("<--<<"))) {
                arrowsCount++;
            }
        }

        return arrowsCount.toString();
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
