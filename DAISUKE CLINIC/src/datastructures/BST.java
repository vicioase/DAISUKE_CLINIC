package datastructures;

import patient.Patient;

// Custom Binary Search Tree of Patient

public class BST {
    private static class Node {
        Patient data;
        Node left, right;

        Node(Patient data) {
            this.data = data;
            left = right = null;
        }
    }
    
    private Node root;

    public BST() {
        this.root = null;
    }

    // Returns a Patient by ID
    public Patient search(int id) {
        return searchRec(this.root, id);
    }

    // Recursive method for method above
    public Patient searchRec(Node root, int id) {
        if (root == null) return null;

        if (root.data.getID() == id) return root.data;

        if (id < root.data.getID()) {
            return searchRec(root.left, id);
        } else {
            return searchRec(root.right, id);
        }
    }

    // Inserts a new Patient
    public void insert(Patient data) {
        this.root = insertRec(this.root, data);
    }

    // Recursive method for method above
    public Node insertRec(Node root, Patient data) {
        if (root == null) {
            return new Node(data);
        }

        if (data.getID() == root.data.getID()) {
            return root;
        }

        if (data.getID() < root.data.getID()) {
            root.left = insertRec(root.left, data);
        } else if (data.getID() > root.data.getID()) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Removes a Patient by ID
    public void remove(int id) {
        this.root = removeRec(this.root, id);
    }

    // Recursive method for method above
    public Node removeRec(Node root, int id) {
        if (root == null) return root;

        if (id < root.data.getID()) {
            root.left = removeRec(root.left, id);
        } else if (id > root.data.getID()){
            root.right = removeRec(root.right, id);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left != null && root.right == null) {
                root = root.left;
            } else if (root.left == null && root.right != null) {
                root = root.right;
            } else {
                root.data = successor(root.right);
                root.right = removeRec(root.right, root.data.getID());
            }
        }

        return root;
    }

    // Successor method for remove()
    public Patient successor(Node root) {
        Patient successorData = root.data;
        while (root.left != null) {
            successorData = root.left.data;
            root = root.left;
        }
        return successorData;
    }

    // Prints all Patients in pre-order
    public void preOrder() {
        preOrderRec(this.root);
        System.out.println();
    }

    public void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Prints all Patients in order
    public void inOrder() {
        inOrderRec(this.root);
        System.out.println();
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }

    // Prints all Patients in post-order
    public void postOrder() {
        postOrderRec(this.root);
        System.out.println();
    }

    public void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.data);
        }
    }
}
