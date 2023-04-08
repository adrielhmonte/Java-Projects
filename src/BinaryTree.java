import javax.swing.tree.TreeNode;

public class BinaryTree {
    
    private TreeNode root;

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public BinaryTree() {
        root = null;
    }

    public void add(int val) {
        root = addHelper(root, val);
    }

    private TreeNode addHelper(TreeNode node, int val) {
        if (node==null) {
            return new TreeNode(val);
        }
        else if (val < node.val) {
            node.left = addHelper(node.left, val);
        }
        else if (val > node.val) {
            node.right = addHelper(node.right, val);
        }
        return node;
    }

    public void remove(int val) {
        root = removeHelper(root, val);
    }

    private TreeNode removeHelper(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        else if (val < node.val) {
            node.left = removeHelper(node.left, val);
        }
        else if (val > node.val) {
            node.right = removeHelper(node.right, val);
        }
        else {
            if (node.left == null && node.right == null) {
                return null;
            }
            else if (node.left == null) {
                return node.right;
            }
            else if (node.right == null) {
                return node.left;
            }
            else {
                TreeNode temp = findMin(node.right);
                node.val = temp.val;
                node.right = removeHelper(node.right, temp.val);
            }
        } 
        return node;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }   

    public boolean search(int val) {
        return searchHelper(root, val);
    }

    private boolean searchHelper(TreeNode node, int val) {
        if (node == null) {
            return false;
        }
        else if (val == node.val) {
            return true;
        }
        else if (val < node.val) {
            return searchHelper(node.left, val);
        }
        else {
            searchHelper(node.right, val);
        }
        return false;
    }

 }
