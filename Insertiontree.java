import java.util.*;
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
public class Insertiontree{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Node root=null;
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int data=sc.nextInt();
        root=insertIntoTree(root,data);
    }
}
public static Node insertIntoTree(Node root,int data){
    if(root==null){
        return new Node(data);
    }
    else if(data>root.data){
        root.right=insertIntoTree(root.right,data);
    }
    else{
        root.left=insertIntoTree(root.left,data);
    }
    return root;
}
}