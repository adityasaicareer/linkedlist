import java.util.*;
public class maxslidingwindow {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int max=arr[i-1];
            if(i+k<=n)
            {
                for(int j=0;j<=k-1;j++)
                {
                    if(arr[i+j]>max)
                    {
                        max=arr[i+j];
                    }
                }
                System.out.println(max);
            }

        }
    }
    
}
