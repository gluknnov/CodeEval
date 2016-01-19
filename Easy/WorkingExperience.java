import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String solve(String input) {
        Map<String, Integer> monthNumbers = Collections.unmodifiableMap(new HashMap<String, Integer>() {{
            put("Jan", 0);
            put("Feb", 1);
            put("Mar", 2);
            put("Apr", 3);
            put("May", 4);
            put("Jun", 5);
            put("Jul", 6);
            put("Aug", 7);
            put("Sep", 8);
            put("Oct", 9);
            put("Nov", 10);
            put("Dec", 11);
        }});

        String[] timePeriods = input.split("; ");
        boolean[] isWorked = new boolean[30*12];
        for (String timePeriod : timePeriods) {
            String[] dates = timePeriod.split("-");
            String[] dateParts;

            dateParts = dates[0].split(" ");
            Integer start = monthNumbers.get(dateParts[0]) + (Integer.parseInt(dateParts[1]) - 1990) * 12;
            dateParts = dates[1].split(" ");
            Integer end = monthNumbers.get(dateParts[0]) + (Integer.parseInt(dateParts[1]) - 1990) * 12;

            for (Integer j = start; j <= end; j++) {
                isWorked[j] = true;
            }
        }

        Integer monthCount = 0;
        for (boolean isWorkedMonth : isWorked) {
            monthCount += isWorkedMonth ? 1 : 0;
        }

        return String.valueOf(monthCount / 12);
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
