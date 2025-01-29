class Node{
    int val;
    Node next;
    Node prev;
    public Node(int v)
    {
        this.val=v;
        this.next=null;
        this.prev=null;
    }
};

class doublelink
{
    Node head;
    Node tail;
    public doublelink()
    {
        this.head=null;
    }

    void add(int v)
    {
        //Node temp=this.head;
        Node newnode=new Node(v);
        if(this.head==null)
        {
            this.head=newnode;
            this.tail=this.head;
        }
        else{
           
            tail.next=newnode;
            newnode.prev=tail;
            tail=tail.next;
            // temp.next=newnode;
            // newnode.prev=temp;
            // temp=temp.next;
        }
    }
    void display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    void reversedisplay()
    {
        Node temp=this.tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
    }
}
public class doublelist {
    public static void main(String args[])
    {
        doublelink d=new doublelink();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.display();
        System.out.println();
        d.reversedisplay();
    }
    
}
