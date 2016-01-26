import java.io.*;

public class Main {
    static Node tree = initTree();

    private static Node initTree() {
        Node root = new Node(30);
        Node node8 = new Node(8);
        Node node20 = new Node(20);
        root.add(node8, new Node(52));
        node8.add(new Node(3), node20);
        node20.add(new Node(10), new Node(29));

        return root;
    }

    public static String solve(String input) {
        String[] nodes = input.split(" ");
        return findLowestCommonAncestor(tree, Integer.parseInt(nodes[0]), Integer.parseInt(nodes[1])).toString();
    }

    private static Node findLowestCommonAncestor(Node searchPoint, Integer left, Integer right) {
        if ((left < searchPoint.getValue()) && (right < searchPoint.getValue())) {
            return findLowestCommonAncestor(searchPoint.getLeft(), left, right);
        } else if ((left > searchPoint.getValue()) && (right > searchPoint.getValue())) {
            return findLowestCommonAncestor(searchPoint.getRight(), left, right);
        } else {
            return searchPoint;
        }
    }

    private static class Node {
        private Integer value;
        private Node left;
        private Node right;

        public Node(Integer value) {
            this.value = value;
        }

        public void add(Node left, Node right) {

            this.left = left;
            this.right = right;
        }

        public Integer getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        @Override
        public String toString() {
            return value.toString();
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
