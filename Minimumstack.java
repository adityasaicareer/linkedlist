import java.util.*;

class stack
{
    Stack<Integer> s1;
    Stack<Integer> s2;
    public stack()
    {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    void add(int v)
    {
        s1.push(v);
        if(s2.isEmpty())
        {
            s2.push(v);
        }
        else if(v<s2.peek()){
            {
                s2.push(v);
            }
        }
    }
    void pop()
    {
        
        if(!s1.isEmpty())
        {
            int t=s1.pop();
            if(t==s2.peek())
            {
                s2.pop();
            }
        }

    }
}
public class Minimumstack {

    public static void main(String args[])
    {
        stack s=new stack();
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int inp=sc.nextInt();
            s.add(inp);
        }


        System.out.println("the minimum stack is "+s.s2.peek());
        sc.close();
    }
    
}
