package introduction;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // Input Lene wala vishay.
//        introduction.BinaryTree tree = new introduction.BinaryTree();
//        tree.populate(scanner);
//        tree.display();
//         tree.prettyDisplay();

        BST tree = new BST(); // object created : tree
        int[] nums = { 5, 2, 7, 1, 4, 6};
//        int[] nums = { 5, 2, 7};
        tree.populate(nums);
        tree.display();
    }
}