import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] distances = input.split(",");
        Integer shortestDistance = Integer.MAX_VALUE;
        for (String distance : distances) {
            Integer distanceLen = distance.indexOf('Y') - distance.lastIndexOf('X') - 1;
            if (shortestDistance > distanceLen) {
                shortestDistance = distanceLen;
            }
        }

        return shortestDistance.toString();
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
