import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line = buffer.readLine();
        StringBuilder result = new StringBuilder();

        char currentPlace = (line.contains("C")) ? 'C' : '_';
        Integer currentPosition = line.indexOf(currentPlace);
        result.append(line.replace(currentPlace, '|')).append("\n");

        while ((line = buffer.readLine()) != null) {
            char nextPlace = (line.contains("C")) ? 'C' : '_';
            Integer nextPosition = line.indexOf(nextPlace);

            if(currentPosition < nextPosition) {
                result.append(line.replace(nextPlace, '\\')).append("\n");
            }
            else if(currentPosition > nextPosition) {
                result.append(line.replace(nextPlace, '/')).append("\n");
            }
            else {
                result.append(line.replace(nextPlace, '|')).append("\n");
            }
            currentPosition = nextPosition;
        }

        System.out.println(result.deleteCharAt(result.length() - 1).toString());
    }
}
