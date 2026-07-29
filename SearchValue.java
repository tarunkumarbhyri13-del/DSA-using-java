class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SearchValue{
Node head;
public boolean search(int target){
    if(head==null){
        return false;
    }
    if(head.data==target){
        return true;
    }
    Node current=head;
    while(current!=null){
        if(current.data==target){
            return true;
        }
        current=current.next;
    }
            return false;
        }
    public void insert(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public static void main (String[] args){
        SearchValue list= new SearchValue();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Searching for 20: " + list.search(20));
        System.out.println("Searching for 40: " + list.search(40));
        }
    }s