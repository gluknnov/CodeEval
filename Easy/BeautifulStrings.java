import java.io.*;
public class Main {
    public static String solve(String input) {
        input = input.toLowerCase();
        Integer beauty = 0;
        Integer beautyValue = 26;
        Integer[] letterCounts = new Integer[26];
        for(Integer i = 0; i < letterCounts.length; i++) {
            letterCounts[i] = 0;
        }

        for(Integer i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if((letter >= 'a') && (letter <= 'z')) {
                letterCounts[letter - 'a']++;
            }
        }

        while (hasLetters(letterCounts)) {
            // I can use one sort operation instead of several find max, but for 26 array size it does not matter 
            Integer maxNum = 0;
            for(Integer i = 0; i < letterCounts.length; i++) {
                if(letterCounts[maxNum] < letterCounts[i]) {
                    maxNum = i;
                }
            }

            beauty += letterCounts[maxNum] * beautyValue;
            letterCounts[maxNum] = 0;
            beautyValue--;
        }

        return beauty.toString();
    }

    private static boolean hasLetters(Integer[] letterCounts) {
        for (Integer i = 0; i < letterCounts.length; i++) {
            if(letterCounts[i] > 0) {
                return true;
            }
        }

        return false;
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
