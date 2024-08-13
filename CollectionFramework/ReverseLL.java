package CollectionFramework;

public class ReverseLL {
    Node head;
    private int size;

    ReverseLL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
    
     Node(String data){
        this.data=data;
        this.next=null;
        size++;
    }
    }
    public void addFirst(String data)
        {
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            
            newNode.next=head;
            head=newNode;
        }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void printlist(){

        if(head==null){
            System.out.println("The list is empty");
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
    }

    public int printSize(){
        return size;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("The list is empty");
        }
        size--;
        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("The list is empty");
        }
        size--;

        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    
    public static void main(String args[]){
        LL2 list=new LL2();
        list.addLast("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printlist();
        
        // System.out.println();
        // list.removeLast();
        // System.out.println();
        // list.printlist();
        System.out.println(list.printSize());
        System.out.println();
        list.reverseIterate();
        list.printlist();
    }
}
