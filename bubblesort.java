import java.util.*;
public class bubblesort {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int j:arr)
        {
            System.out.print(j+" ");
        }
        System.out.println();
        sc.close();
    }
    
}
