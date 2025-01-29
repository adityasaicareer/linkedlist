
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

class LinkedList
{
    Node head;
    Node tail;
    public LinkedList()
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
        }
        else{
            this.tail.next=new Node(v);
            this.tail=this.tail.next;
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
    boolean cyclic()
    {
        Node fast=head;
        Node slow=head;

        while((fast.next!=null && fast!=null) && slow!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}
public class loopdetection
{

    public static boolean cyclic(Node root)
    {
        Node first=root;
        Node second=root;
        while(first.next!=null && first!=null && second!=null)
        {
            second=second.next;
            first=first.next.next;
            if(second==first)
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(l.cyclic());
        System.out.println(cyclic(l.head));
        l.head.next.next.next=l.head.next.next;

        System.out.println(l.cyclic());
        System.out.println(cyclic(l.head));;


    }

      
}