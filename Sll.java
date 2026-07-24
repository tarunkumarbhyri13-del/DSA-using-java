class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public class Sll{
        private Node head;
        public void insertAtbegin(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        public void insertAtend(int data){
            Node newNode=new Node(data);
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
        public void display(){
            Node current=head;
            while(current!=null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.print("null");
        } 
    
    public static void main(String[] args){
        Sll li=new Sll();
        li.insertAtbegin(10);
        li.insertAtbegin(20);
        li.insertAtend(30);
        li.display();
    }
}
    