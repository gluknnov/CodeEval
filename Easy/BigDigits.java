import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] digits = { "-**----*--***--***---*---****--**--****--**---**--",
                            "*--*--**-----*----*-*--*-*----*-------*-*--*-*--*-",
                            "*--*---*---**---**--****-***--***----*---**---***-",
                            "*--*---*--*-------*----*----*-*--*--*---*--*----*-",
                            "-**---***-****-***-----*-***---**---*----**---**--",
                            "--------------------------------------------------"};
        StringBuilder[] result = new StringBuilder[digits.length];
        for(Integer i = 0; i < result.length; i++) {
            result[i] = new StringBuilder();
        }

        for(Integer i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if((c >= '0') && (c <= '9')) {
                Integer digitStart = (c - '0') * digits[0].length() / 10;
                for(Integer j = 0; j < digits.length; j++) {
                    result[j].append(digits[j].substring(digitStart, digitStart + digits[0].length() / 10));
                }
            }
        }

        StringBuilder output = new StringBuilder();
        for (StringBuilder line : result) {
            output.append(line).append("\n");
        }

        return output.deleteCharAt(output.length() - 1).toString();
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
