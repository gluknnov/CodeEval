import java.io.*;
public class Main {
    public static String solve(String input) {
        String[] lists = input.split(";");
        ListIterator listIterator1 = new ListIterator(lists[0]);
        ListIterator listIterator2 = new ListIterator(lists[1]);
        StringBuilder result = new StringBuilder();

        while((listIterator1.getNumber() < listIterator2.getNumber()) && (listIterator1.hasNext())) {
            listIterator1.nextNumber();
        }
        while((listIterator2.getNumber() < listIterator1.getNumber()) && (listIterator2.hasNext())) {
            listIterator2.nextNumber();
        }

        while(listIterator1.getNumber().equals(listIterator2.getNumber())) {
            result.append(listIterator1.getNumber()).append(",");
            if((listIterator1.hasNext()) && (listIterator2.hasNext())) {
                listIterator1.nextNumber();
                listIterator2.nextNumber();
            }
            else {
                break;
            }
        }

        if(result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }

    private static class ListIterator {
        private Integer cursorPosition = 0;
        private Integer cursorNumber;
        private String[] list;

        public ListIterator(String list) {
            this.list = list.split(",");
            cursorNumber = Integer.parseInt(this.list[cursorPosition]);
        }

        public Integer getNumber() {
            return cursorNumber;
        }

        public boolean hasNext() {
            return cursorPosition + 1 < list.length;
        }

        public void nextNumber() {
            cursorNumber = Integer.parseInt(list[++cursorPosition]);
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
