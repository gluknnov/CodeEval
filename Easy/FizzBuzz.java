import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            StringBuilder result = new StringBuilder();
        String[] lineArgs = line.split(" ");
        Integer fizz = Integer.parseInt(lineArgs[0]);
        Integer buzz = Integer.parseInt(lineArgs[1]);
        Integer stopIndex = Integer.parseInt(lineArgs[2]);

        for (Integer i = 1; i <= stopIndex; i++) {
            if((i % fizz == 0) && (i % buzz == 0)) {
                result.append("FB");
            }
            else if(i % fizz == 0) {
                result.append("F");
            }
            else if(i % buzz == 0) {
                result.append("B");
            }
            else {
                result.append(i);
            }

            if(i != stopIndex) {
                result.append(" ");
            }
        }

         System.out.println(result.append("\n").toString());
        }
    }
}
