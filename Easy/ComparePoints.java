import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] coords= input.split(" ");
        Integer O = Integer.parseInt(coords[0]);
        Integer P = Integer.parseInt(coords[1]);
        Integer Q = Integer.parseInt(coords[2]);
        Integer R = Integer.parseInt(coords[3]);

        StringBuilder direction = new StringBuilder();

        if(R > P) {
            direction.append("N");
        }
        else if(R < P) {
            direction.append("S");
        }
        if(Q > O) {
            direction.append("E");
        }
        else if(Q < O) {
            direction.append("W");
        }
        
        return direction.length() > 0 ? direction.toString() : "here";
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
