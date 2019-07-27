package BinarySearchTree;

public class App {

    public static void main(String[] args) {

        BST tree = new BST();
        tree.insert(10, "Ten");
        tree.insert(20, "Twenty");
        tree.insert(30, "Thirty");
        tree.insert(15, "Fifteen");
        tree.insert(5, "test");
        tree.insert(6, "test");

//        System.out.println(tree.findMax());
//        System.out.println(tree.findMin());
//
//        System.out.println(tree.remove(10));
//        System.out.println(tree.findMin());

        tree.displayTree();

    }

}
