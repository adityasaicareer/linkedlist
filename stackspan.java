import java.util.*;
public class stackspan {
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            s.push(sc.nextInt());
        }

        int arr[]=new int[n];
        int p=0;

        for(int i=1;i<=n;i++)
        {
            Stack<Integer> s1=new Stack<>();
            for(int j=1;j<=i;j++)
            {
                s1.push(s.pop());
            }
            int count=0;
            System.out.println(s1);
            int r=s1.peek();
            while(!s1.isEmpty())
            {
               if(s1.peek()<r)
               {
                s.push(s1.pop());
                count++;
               }
               else{
                s.push(s1.pop());
               }
            }
            arr[p++]=count+1;
            System.out.println(s);

        }

        for(int j: arr)
        {
            System.out.println(j);
        }

        sc.close();
    }
    
}
