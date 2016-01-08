import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] numbersString = input.split(" ");
        int lowestNumber = 0;
        char lowestChar = '9';
        boolean found = false;
        for(int i = 0; i < numbersString.length; i++) {
            if (isUnique(i, numbersString) && lowestChar > numbersString[i].charAt(0)) {
                lowestNumber = i;
                lowestChar = numbersString[lowestNumber].charAt(0);
                found = true;
            }
        }

        return found ? String.valueOf(lowestNumber + 1) : "0";
    }

    private static boolean isUnique(int position, String[] numbersString) {
        for(int i = 0; i < numbersString.length; i++) {
            if((i != position) && (numbersString[i].charAt(0) == numbersString[position].charAt(0))) {
                return false;
            }
        }

        return true;
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
