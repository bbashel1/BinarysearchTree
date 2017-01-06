package cs303lab8;

public class Node {
	public Node leftChild;
	public Node rightChild;
	public int data;
	public int value;


	public Node(Node leftChild, Node rightChild, int data) {

		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.data = data;
	}

	public Node(int data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}

	public Node getLeftChild() {
		return this.leftChild;
	}

	public Node getRightChild() {
		return this.rightChild;
	}

	public int getData() {
		return this.data;
	}

	public boolean delete(int data, Node parent) {
		if(data < this.data){
			if(leftChild != null)
				return leftChild.delete(data, this);
			else
				return false;
			
		}else if(data > this.data){
			if(rightChild != null)
				return rightChild.delete(data, this);
			else
				return false;
		}
		else{
			if(leftChild != null && rightChild != null){
				this.data = rightChild.minValue();
				rightChild.delete(this.data, this);
				
			}else if(parent.leftChild == this){
				parent.leftChild = (leftChild != null) ? leftChild : rightChild;
				
			}else if(parent.rightChild == this){
				parent.rightChild = (leftChild != null) ? leftChild :rightChild;
			}
		}
		return true;
	}

	private int minValue() {
		if (leftChild == null)
			return value;
		else
			return leftChild.minValue();
	}

	public void setLeftChild(Node root) {
		leftChild = root;
		
	}
}