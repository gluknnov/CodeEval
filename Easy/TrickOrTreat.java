import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] args = input.split(",");
        Integer vampires = Integer.parseInt(args[0].split(": ")[1]);
        Integer zombies = Integer.parseInt(args[1].split(": ")[1]);
        Integer witches = Integer.parseInt(args[2].split(": ")[1]);
        Integer houses = Integer.parseInt(args[3].split(": ")[1]);

        Integer candies = (vampires * 3 + zombies * 4 + witches * 5) * houses;
        Integer children = vampires + zombies + witches;

        return String.valueOf((int)(candies / children));
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
