import java.io.*;
public class Main {
    private static class QueryBoard {
        private Integer size;
        private Integer[][] board;

        public QueryBoard(Integer size) {
            this.size = size;
            board = new Integer[size][size];
            for(Integer i = 0; i < size; i++) {
                for(Integer j = 0; j < size; j++) {
                    board[i][j] = 0;
                }
            }
        }

        public void setRow(Integer row, Integer value) {
            for(Integer i = 0; i < size; i++) {
                board[row][i] = value;
            }
        }

        public void setCol(Integer col, Integer value) {
            for(Integer i = 0; i < size; i++) {
                board[i][col] = value;
            }
        }

        public Integer queryRow(Integer row) {
            Integer sum = 0;
            for(Integer i = 0; i < size; i++) {
                sum += board[row][i];
            }
            return sum;
        }

        public Integer queryCol(Integer col) {
            Integer sum = 0;
            for(Integer i = 0; i < size; i++) {
                sum += board[i][col];
            }
            return sum;
        }
    }
    
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        QueryBoard queryBoard = new QueryBoard(256);
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] command = line.split(" ");
            switch (command[0]) {
                case "SetRow":
                    queryBoard.setRow(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "SetCol":
                    queryBoard.setCol(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "QueryRow":
                    System.out.println(queryBoard.queryRow(Integer.parseInt(command[1])));
                    break;
                case "QueryCol":
                    System.out.println(queryBoard.queryCol(Integer.parseInt(command[1])));
                    break;
            }
        }
    }
}
