package introduction;
import java.util.Scanner;

// https://chatgpt.com/share/b379d88a-f487-4d8e-af7d-511823729da5

public class BinaryTree {

    // Constructor
    public BinaryTree() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;
        // Constructor
        public Node(int value) {
            this.value = value;
        }
    }


    private Node root;

    // Insert Elements.
    public void populate(Scanner scanner){
        System.out.println("Enter the value of  root Node.");
        System.out.print(">>> ");
        System.out.println();
        int value = scanner.nextInt(); // takes input
        root = new Node(value); // store in root
        populate(scanner, root); // passed to another fn
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + " true/false");

        // Left
        boolean left = scanner.nextBoolean(); // Takes input
        if(left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt(); // takes input
            node.left = new Node(value);  // store  // node.left is a reference that points to the left child node.
            populate(scanner, node.left);   // call
        }

        // Right
        System.out.println("Do you want to enter right of " + node.value + " true/false");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();  // takes input
            node.right = new Node(value);   // store
            populate(scanner, node.right);  // call
        }
    }

    // Display Function.
    public void display() {
        display(this.root, "");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");// "\t": This is an escape sequence in Java that represents a tab character.

        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }


    // TRANSVERSALS
    // N -> L -> R
    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " "); // root
        preOrder(node.left);
        preOrder(node.right);
    }

    // L -> N -> R
    public void inOrder() {
        preOrder(root);
    }
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " "); // root
        preOrder(node.right);
    }

    // L -> R -> N
    public void postOrder() {
        preOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " "); // root
    }
}
























