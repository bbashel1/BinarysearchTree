package cs303lab8;
public class BinarySearchTree {

	Node root;
	public BinarySearchTree() {
		root = null;
	}
	public boolean search(Node node, int value) {
		while( node != null && value != node.data){
			if( value < node.data)
				node = node.leftChild;
			else
				node = node.rightChild;
				}
		return node != null;
	}

	public Node insert(Node node, int data) {
		if(node == null) {
			node = new Node(data);

		}
		else if(data < node.data) {
			node.leftChild = insert(node.leftChild, data);
		}else 
			node.rightChild = insert(node.rightChild, data);

		return node;

	}
	public boolean delete(int data ){
		if(root == null)
			return false;
		else{
			if(root.getData() == data){
				Node addedRoot = new Node(0);
				addedRoot.setLeftChild(root);
				boolean result = root.delete(data, addedRoot);
				root = addedRoot.getLeftChild();
				return result;
				
				}else{
					return root.delete(data, null);
				}
		}
	}
	
	public void inOrder() {
		inOrder(root);		

	}
	
	public void inOrder(Node node) {

		if(node != null) {
			inOrder(node.leftChild);
			System.out.println("Data: " + node.data);
			inOrder(node.rightChild);
			

		}

	}

}