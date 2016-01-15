import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] lists = input.split("\\|");
        String[] list0 = lists[0].trim().split(" ");
        String[] list1 = lists[1].trim().split(" ");
        StringBuilder result = new StringBuilder();
        for(Integer i = 0; i < list0.length; i++) {
            result.append(Integer.parseInt(list0[i]) * Integer.parseInt(list1[i]));
            if(i != list0.length - 1) {
                result.append(" ");
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
