import java.util.*;
public class Mergesort {

    public static int[] merge(int left[],int right[])
    {
        int output[]=new int[left.length+right.length];
        int k=0;
        int i=0;
        int j=0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                output[k++]=left[i++];
            }
            else{
                output[k++]=right[j++];
            }
        }

        while(i<left.length)
        {
            output[k++]=left[i++];
        }

        while(j<right.length)
        {
            output[k++]=right[j++];
        }

        return output;

    }
    
    public static int[] mergesort(int arr[])
    {
       if(arr.length<2)
       {
            return arr;
       }
       int low=0;
       int high=arr.length;
        int mid=(low+high)/2;

        int left[]=mergesort(Arrays.copyOfRange(arr,low,mid));
        int right[]=mergesort(Arrays.copyOfRange(arr,mid,high));

        return merge(left,right);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }

        int out[]=mergesort(arr);

        for(int j=1;j<=out.length;j++)
        {
            System.out.print(out[j-1]+" ");
        }

        sc.close();
    }
    
}
