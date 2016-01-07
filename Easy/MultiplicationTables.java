import java.io.*;
public class Main {
    public static String solve(String input) {
        Integer range = Integer.parseInt(input);
        StringBuilder result = new StringBuilder();
        for (Integer i = 1; i <= range; i++) {
            StringBuilder resultLine = new StringBuilder();
            for(Integer j = 1; j <= range; j++) {
                resultLine.append(String.format("%1$4d", i * j));
            }

            result.append(resultLine.toString().trim());
            if(!i.equals(range)) {
                result.append("\n");
            }
        }

        return result.toString();
    }
    
    public static void main (String[] args) throws IOException {
        //File file = new File(args[0]);
        //BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        //while ((line = buffer.readLine()) != null) {
            line = "12";
            System.out.println(solve(line));
        //}
    }
}
