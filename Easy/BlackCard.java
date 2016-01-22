import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static String solve(String input) {
        String[] args = input.split("\\|");
        List<String> pirates = new LinkedList<>(Arrays.asList(args[0].trim().split(" ")));
        Integer blackSpotNumber = Integer.parseInt(args[1].trim()) - 1;

        while (pirates.size() > 1) {
            pirates.remove(pirates.get(blackSpotNumber % pirates.size()));
        }

        return pirates.get(0);
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
