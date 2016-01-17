import java.io.*;
import java.util.Arrays;

public class Main {
    public static String solve(String input) {
        String[] cityInfo = input.split(";");
        Integer[] cityLocations = new Integer[cityInfo.length];
        for(Integer i = 0; i < cityInfo.length; i++) {
            cityLocations[i] = Integer.parseInt(cityInfo[i].trim().split(",")[1]);
        }
        Arrays.sort(cityLocations);

        StringBuilder result = new StringBuilder();
        result.append(cityLocations[0]).append(",");
        for(Integer i = 1; i < cityLocations.length; i++) {
            result.append(cityLocations[i] - cityLocations[i - 1]).append(",");
        }

        return result.deleteCharAt(result.length() - 1).toString();
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
