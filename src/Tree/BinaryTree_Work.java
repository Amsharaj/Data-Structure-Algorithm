package Tree;
class Node1{
	int item;
	Node left,right;
	public Node1(int key) {
		item=key;
		left=right=null;
	}
}
public class BinaryTree_Work {
	Node root;
	BinaryTree_Work(){
		root=null;
	}
	void inorder(Node node) {
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.item+"->");
		inorder(node.right);
	}
	void preorder(Node node) {
		if(node==null)
			return;
		System.out.print(node.item+"->");
		preorder(node.left);
		preorder(node.right);
	}
	void postorder(Node node) {
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.item+"->");
	}
	
	

	public static void main(String[] args) {
		BinaryTree_Work t=new BinaryTree_Work();
		t.root=new Node(1);
		t.root.left=new Node(12);
		t.root.left.left=new Node(6);
		t.root.left.right=new Node(10);
		t.root.left.left.left=new Node(2);
		t.root.left.left.right=new Node(3);
		t.root.right=new Node(13);
		t.root.right.left=new Node(8);
		t.root.right.right=new Node(9);
		System.out.println("Inorder Traverse");
		t.inorder(t.root);
		System.out.println("\nPreorder Traverse");
		t.preorder(t.root);
		System.out.println("\nPostorder Traverse");
		t.postorder(t.root);
	}

}
