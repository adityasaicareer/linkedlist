import java.util.*;
public class Mergesortrevision {

    public static int[] merge(int left[],int right[])
    {
        int output[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&&j<right.length)
        {
            if(left[i]<right[j])
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

        int mid=arr.length/2;

        int left[]=mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of N:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }

        int result[]=mergesort(arr);

        for(int i:result)
        {
            System.out.print(i+" ");
        }

        sc.close();

    }
    
}
