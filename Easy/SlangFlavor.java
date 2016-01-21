import java.io.*;

public class Main {
    private static boolean shouldReplace = false;
    private static Integer currentPhrase = 0;
    private static String[] additionPrhases = {", yeah!", ", this is crazy, I tell ya.", ", can U believe this?", ", eh?", ", aw yea.", ", yo.", "? No way!", ". Awesome!"};

    public static String solve(String input) {
        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if((c == '.') || (c == '!') || (c == '?')) {
                if(shouldReplace) {
                    result.append(additionPrhases[currentPhrase]);
                    currentPhrase = (currentPhrase + 1) % additionPrhases.length;
                }
                else {
                    result.append(c);
                }

                shouldReplace = !shouldReplace;
            }
            else {
                result.append(c);
            }
        }

        return result.toString();
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
