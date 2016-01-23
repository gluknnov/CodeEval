import java.io.*;

public class Main {
    public static String solve(String input) {
        String[] numbersString = input.split(" ");
        SimpleStack stack = new SimpleStack();
        for (String numberString : numbersString) {
            stack.push(Integer.parseInt(numberString));
        }

        StringBuilder result = new StringBuilder();
        for(Integer i = 0; !stack.isEmpty(); i++) {
            if(i % 2 == 0) {
                result.append(stack.pop()).append(" ");
            }
            else {
                stack.pop();
            }
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }

    private static class SimpleStack {
        private Integer minArraySize = 8;
        private Integer[] values = new Integer[minArraySize];
        private Integer top = -1;

        public void push(Integer value) {
            top++;
            if (top >= values.length) {
                Integer[] resizedArray = new Integer[values.length * 2];
                System.arraycopy(values, 0, resizedArray, 0, values.length);
                values = resizedArray;
            }
            values[top] = value;
        }

        public boolean isEmpty() {
            return top < 0;
        }

        public Integer pop() {
            if((values.length >= top * 3) && (values.length > minArraySize)) {
                Integer[] resizedArray = new Integer[values.length / 2];
                System.arraycopy(values, 0, resizedArray, 0, top + 1);
                values = resizedArray;
            }
            Integer value = values[top];
            top--;
            return value;
        }
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
