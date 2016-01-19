import java.io.*;

public class Main {
    public static String solve(String input) {
        Integer[] ages = {2, 4, 11, 14, 18, 22, 65, 100};
        String[] messages = {"Still in Mama's arms", "Preschool Maniac", "Elementary school", "Middle school", "High school", "College", "Working for the man", "The Golden Years"};
        Integer age = Integer.parseInt(input);
        if((age < 0) || (age > 100)) {
            return "This program is for humans";
        }

        for(Integer i = 0; i < ages.length; i++) {
            if(age <= ages[i]) {
                return messages[i];
            }
        }

        return "This program is for humans";
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
