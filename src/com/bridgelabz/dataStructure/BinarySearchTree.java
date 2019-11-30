package com.bridgelabz.dataStructure;

public class BinarySearchTree {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}
		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	public void inorder() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	   public void deleteKey(int key) 
	    { 
	        root = deleteRec(root, key); 
	    } 
	  
	    /* A recursive function to insert a new key in BST */
	    Node deleteRec(Node root, int key) 
	    { 
	        /* Base Case: If the tree is empty */
	        if (root == null)  return root; 
	  
	        /* Otherwise, recur down the tree */
	        if (key < root.key) 
	            root.left = deleteRec(root.left, key); 
	        else if (key > root.key) 
	            root.right = deleteRec(root.right, key); 
	  
	        // if key is same as root's key, then This is the node 
	        // to be deleted 
	        else
	        { 
	            // node with only one child or no child 
	            if (root.left == null) 
	                return root.right; 
	            else if (root.right == null) 
	                return root.left; 
	  
	            // node with two children: Get the inorder successor (smallest 
	            // in the right subtree) 
	            root.key = minValue(root.right); 
	  
	            // Delete the inorder successor 
	            root.right = deleteRec(root.right, root.key); 
	        } 
	  
	        return root; 
	    } 
	    public int minValue(Node root) 
	    { 
	        int minv = root.key; 
	        while (root.left != null) 
	        { 
	            minv = root.left.key; 
	            root = root.left; 
	        } 
	        return minv; 
	    } 
		
		// A utility function to search a given key in BST 
		public Node search(Node root, int key) 
		{ 
			// Base Cases: root is null or key is present at root 
			if (root==null || root.key==key) 
				return root; 

			// val is greater than root's key 
			if (root.key > key) 
				return search(root.left, key); 

			// val is less than root's key 
			return search(root.right, key); 
		} 


		// Driver Program to test above functions 
		public static void main(String[] args) { 
			BinarySearchTree tree = new BinarySearchTree(); 

		
			tree.insert(50); 
			tree.insert(30); 
			tree.insert(20); 
			tree.insert(40); 
			tree.insert(70); 
			tree.insert(60); 
			tree.insert(80); 

			// print inorder traversal of the BST 
			tree.inorder(); 
			System.out.println();
			tree.deleteKey(50);
			tree.inorder(); 
		} 
	} 


