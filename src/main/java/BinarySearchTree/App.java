package BinarySearchTree;

public class App {

    public static void main(String[] args) {

        BST tree = new BST();
        tree.insert(10, "Ten");
        tree.insert(20, "Twenty");
        tree.insert(30, "Thirty");
        tree.insert(15, "Fifteen");

        System.out.println(tree.findMax());
        System.out.println(tree.findMin());

    }

}
