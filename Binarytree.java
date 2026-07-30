class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Binarytree{
    public static void main(String[] args){
        Node head=new Node(5);
        Node p=new Node(34);
        Node q=new Node(4);
        head.left=p;
        head.right=q;
        System.out.println("Root Node:" + head.data);
        System.out.println("LeftChild:" + head.left.data);
        System.out.println("RightChild:" + head.right.data);
    }
}