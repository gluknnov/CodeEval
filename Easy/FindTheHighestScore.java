import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] scoresLines = input.split("\\|");
        StringBuilder result = new StringBuilder();
        String[][] scores = new String[scoresLines.length][];
        for(Integer i = 0; i < scoresLines.length; i++) {
            scores[i] = scoresLines[i].trim().split(" ");
        }

        for(Integer i = 0; i < scores[0].length; i++) {
            Integer max = Integer.MIN_VALUE;
            for(Integer j = 0; j < scoresLines.length; j++) {
                int score = Integer.parseInt(scores[j][i]);
                if(max < score) {
                    max = score;
                }
            }
            result.append(max).append(" ");
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
