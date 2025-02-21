package Questions;

import java.util.*;

public class BTLevelOrderTraversal {
    // Q 102 : https://leetcode.com/problems/binary-tree-level-order-traversal/
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Main list of list
        List<List<Integer>>  result = new ArrayList();
        if(root == null){
            return result;
        }
        // Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i= 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val); // internal list.
                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    // Q 637 : https://leetcode.com/problems/average-of-levels-in-binary-tree/
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>  result = new ArrayList();
        if(root == null){
            return result;
        }
        // Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double averageLevel = 0;
            for (int i= 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                averageLevel += currentNode.val;
                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            averageLevel = averageLevel / levelSize;
            result.add(averageLevel);
        }
        return result;
    }

    public TreeNode findSuccessor(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        // Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            TreeNode currentNode = queue.poll();
            if(currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == key){
                break;
            }
        }
        return queue.peek();
    }

    // Q 103 : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Main list of list
        List<List<Integer>>  result = new ArrayList();
        if(root == null){
            return result;
        }
        // Queue
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i= 0; i < levelSize; i++) {

                if(!reverse){
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val); // internal list.
                    if(currentNode.left != null)  {
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else{
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val); // internal list.
                    if(currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    // Q 107 : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Main list of list
        List<List<Integer>>  result = new ArrayList();

        if(root == null){
            return result;
        }

        // Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i= 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val); // internal list.
                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(0, currentLevel);
        }
        return result;
    }

    // Q 116 : https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Node leftMost = root;
        while(leftMost.left != null) {
            Node current = leftMost;
            while(current != null) {
                current.left.next = current.right;
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;

        }
        return root;
    }

    // Q 199 : https://leetcode.com/problems/binary-tree-right-side-view/description/
    public List<Integer> rightSideView(TreeNode root) {
        // Main list of list
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }
        // Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if(i==levelSize -1) {
                    result.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }

    // Q 993 : https://leetcode.com/problems/cousins-in-binary-tree/description/
    public boolean isCousins(TreeNode root, int x, int y) {
        //it will first find the nodes where they are.
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        // then it will check if they are at same level, after Check for they are not the siblings.
        return (
                (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy))
        );
    }

    private TreeNode findNode(TreeNode node, int x) {
        if(node == null) {
            return null;
        }
        if(node.val == x) {
            return node;
        }
        TreeNode n = findNode(node.left, x);
        if(n != null){ // when ans is found it will be return  the  upper call and if this conditional statement is not there, even if the ans is found the next call will call.
            return n;
        }
        return findNode(node.right, x);
    }

    boolean isSibling (TreeNode node, TreeNode x, TreeNode y) {
        if(node == null) {
            return false;
        }
        return (
                (node.left == x && node.right == y) || (node.left == y && node.right == x) /* both combination */ || isSibling(node.left, x, y) || isSibling(node.right, x, y)
        );
    }

    int level(TreeNode node,TreeNode x, int lev) {
        if (node == null) {
            return 0;
        }
        if(node == x) {
            return lev;
        }
        int l = level(node.left, x, lev+1);
        if(l != 0){
            return l;
        }
        return level(node.right, x, lev+1);
    }

    // Q 101 :  https://leetcode.com/problems/symmetric-tree/description/
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == right){
                continue;
            }
            if(left == null || right == null){
                return false;
            }
            if(left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    // Q 543 :
//    https://chatgpt.com/share/07d40ed6-a307-495e-a271-8c5eba4ec88d
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }
    int height(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Q 226 : https://leetcode.com/problems/invert-binary-tree/
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    // Q 104 :

    // Q 114 : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    public void flatten(TreeNode root) {
        TreeNode current = root;
        while(current!=null){
            if(current.left!=null) {
                TreeNode temp = current.left;
                //Goes at Right Most.
                while(temp.right!= null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    // Q 98 : https://leetcode.com/problems/validate-binary-search-tree/
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    boolean helper(TreeNode node, Integer low, Integer high) {
        if(node == null) {
            return true;
        }
        if(low != null && node.val <= low) {
            return false;
        }
        if(high != null && node.val >= high) {
            return false;
        }
        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
    }



}






// Classes

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};