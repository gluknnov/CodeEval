import java.io.*;
import java.util.Arrays;

public class Main {
    public static String solve(String input) {
        String[] times = input.split(" ");
        Arrays.sort(times);
        String[] time0 = times[0].split(":");
        String[] time1 = times[1].split(":");
        
        Integer hours = Integer.parseInt(time1[0]) - Integer.parseInt(time0[0]);
        Integer mins = Integer.parseInt(time1[1]) - Integer.parseInt(time0[1]);
        Integer secs = Integer.parseInt(time1[2]) - Integer.parseInt(time0[2]);
        if(mins < 0) {
            hours--;
            mins += 60;
        }
        if(secs < 0) {
            mins--;
            secs += 60;
        }

        return String.format("%02d:%02d:%02d", hours, mins, secs);
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
