
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

 class Linked
 {
    ListNode head;
    ListNode tail;
    public Linked()
    {
        this.head=null;
        this.tail=this.head;
    }

    void add(int v)
    {
        
        if(this.head==null)
        {
            this.head=new ListNode(v);
            this.tail=this.head;
        }
        else{
            this.tail.next=new ListNode(v);
            this.tail=this.tail.next;

        }
    }

    
 }
public class Addnumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int rem=0;
        Linked l3=new Linked();
        while(l1!=null && l2!=null)
        {
            int sum=l1.val+l2.val+rem;
            l3.add(sum%10);
            rem=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null)
        {
            while(l2!=null)
            {
                int sum=l2.val+rem;
                l3.add(sum%10);
                rem=sum/10;
                l2=l2.next;
            }
        }
        if(l2==null)
        {
            while(l1!=null)
            {
                int sum=l1.val+rem;
                l3.add(sum%10);
                rem=sum/10;
                l1=l1.next;
            }
        }
        if(rem!=0)
        {
            l3.add(rem);
        }
        System.out.println(l3);
        return l3.head;
        
        
        
    }
}