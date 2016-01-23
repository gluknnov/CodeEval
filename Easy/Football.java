import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static String solve(String input) {
        String[] countries = input.split("\\|");
        TreeMap<Integer, ArrayList<Integer>> teamToCountriesMap = new TreeMap<>();
        for(Integer i = 0; i < countries.length; i++) {
            String[] teams = countries[i].trim().split(" ");
            for (String teamString : teams) {
                Integer team = Integer.parseInt(teamString);
                if (!teamToCountriesMap.containsKey(team)) {
                    teamToCountriesMap.put(team, new ArrayList<Integer>());
                }
                teamToCountriesMap.get(team).add(i + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Integer, ArrayList<Integer>> teamToCountriesEntry : teamToCountriesMap.entrySet()) {
            result.append(teamToCountriesEntry.getKey()).append(":");
            Object[] countriesArray = teamToCountriesEntry.getValue().toArray();
            Arrays.sort(countriesArray);
            for (Object contrite : countriesArray) {
                result.append(contrite).append(",");
            }
            result.deleteCharAt(result.length() - 1).append("; ");
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
