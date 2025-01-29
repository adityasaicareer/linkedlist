class Node
{
    int val;
    Node next;
    public Node(int v)
    {
        this.val=v;
        this.next=null;
    }

}

class Linked{
    Node head;
    Node tail;
    public Linked()
    {
        this.head=null;
        this.tail=null;
    }

    void add(int v)
    {
        if(this.head==null)
        {
            this.head=new Node(v);
            this.tail=this.head;
            return;
        }

        this.tail.next=new Node(v);
        this.tail=this.tail.next;
        return;
    }
    void addLast(int v)
    {
        if(this.head==null)
        {
            this.head=new Node(v);
            this.tail=this.head;
            return;
        }
        this.tail.next=new Node(v);
        this.tail=this.tail.next;
        return;
    }
    void display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void removeFirst()
    {
        if(this.head==null)
        {
            System.out.println("error");
            return;
        }
        this.head=this.head.next;
        
    }
    void removeLast()
    {
        Node temp=this.head;
        if(this.head==null)
        {
            System.out.println("error");
        }
        else if(this.head.next==null)
        {
            this.head=null;
            this.tail=null;
        }
        
        while(temp.next!=this.tail)
        {
            temp=temp.next;
        }
        this.tail=temp;
        this.tail.next=null;
        

    }
}
public class Linkedlist
{
    public static void main(String args[])
    {
        Linked l=new Linked();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.display();
        l.addLast(6);
        l.addLast(7);
        l.display();
        l.removeFirst();
        l.display();
        l.removeLast();
        l.display();

    }
}