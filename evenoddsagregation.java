
import java.util.*;

class Node{
    int val;
    Node next;
    public Node(int v)
    {
        this.val=v;
        this.next=null;
    }
}

class linkedlist{
    Node head;
    Node tail;
    public linkedlist()
    {
        this.head=null;
        this.tail=this.head;
    }

    void add(int v)
    {
        if(head==null)
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

}
public class evenoddsagregation {

    public static void main(String args[])
    {
        linkedlist l=new linkedlist();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int n2=sc.nextInt();
            l.add(n2);
        }
        
        linkedlist l1=new linkedlist();
        linkedlist l2=new linkedlist();
        
        Node n1=l.head;

        while(n1!=null)
        {
            if(n1.val%2==0)
            {
                l1.add(n1.val);
            }
            else{
                l2.add(n1.val);
            }
            n1=n1.next;
        }

        l1.display();
        System.out.println();
        l2.display();

        l1.tail.next=l2.head;
        System.out.println();
        l1.display();
        sc.close();


    }
    
}
