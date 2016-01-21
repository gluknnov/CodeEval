import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(";");
        Integer daysRange = Integer.parseInt(args[0]);
        String[] daysGain = args[1].split(" ");

        Integer currentGain = 0;
        for (Integer i = 0; i < daysRange; i++) {
            currentGain += Integer.parseInt(daysGain[i]);
        }

        Integer maxGen = currentGain;
        for(Integer i = daysRange; i < daysGain.length; i++) {
            currentGain += Integer.parseInt(daysGain[i]) - Integer.parseInt(daysGain[i - daysRange]);
            if(maxGen < currentGain) {
                maxGen = currentGain;
            }
        }

        return maxGen > 0 ? maxGen.toString() : "0";
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
