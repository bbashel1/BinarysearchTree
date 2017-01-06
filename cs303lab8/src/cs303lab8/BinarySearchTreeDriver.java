package cs303lab8;

public class BinarySearchTreeDriver {
BinarySearchTree bst;
	
	public BinarySearchTreeDriver() {
		bst = new BinarySearchTree();		
	}
	
	public static void main(String[] args) {
		BinarySearchTreeDriver build = new BinarySearchTreeDriver();
		build.buildTree();
		
	}

	public void buildTree() {
		System.out.println("");
		this.bst.root = new Node(5);
		this.bst.insert(this.bst.root, 9);
		this.bst.insert(this.bst.root, 3);
		this.bst.insert(this.bst.root, 1);
		this.bst.insert(this.bst.root, 6);
		this.bst.insert(this.bst.root, 8);
		this.bst.insert(this.bst.root, 2);
		this.bst.inOrder();
		
		boolean search = this.bst.search(this.bst.root, 10);
		System.out.println("found element:"+ search);
		this.bst.inOrder();
		
		boolean delete = this.bst.delete(1);
		System.out.println("deleted:" + delete);
		this.bst.inOrder();
		
		
	}
	
}
