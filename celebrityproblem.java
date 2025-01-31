import java.util.*;
public class celebrityproblem {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[][]=new int[n][n];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                arr[i-1][j-1]=sc.nextInt();
            }
        }

     
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=n;j++)
            {

            }
        }

        sc.close();
    }
    
}
