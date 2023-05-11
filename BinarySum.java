public class BinarySum {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public Node root;

    public BinarySum() {
        root = null;
    }
    public int calculate(Node temp) {
        int sum;
        int sumLeft = 0;
        int sumRight = 0;

        if (root == null) {
            return 0;
        } else {
            if (temp.left != null) {
                sumLeft = calculate(temp.left);
            }
            if (temp.right != null) {
                sumRight = calculate(temp.right);
            }
        }
        sum = temp.value + sumLeft + sumRight;
        return sum;
    }

    public static void main(String[] args) {
        BinarySum value = new BinarySum();

        value.root = new Node(5);
        value.root.left = new Node(2);
        value.root.right = new Node(8);
        value.root.left.left = new Node(1);
        value.root.right.right = new Node(7);
        value.root.right.left = new Node(6);


        System.out.println("The sum of the binary tree: " + value.calculate(value.root));
    }
}
