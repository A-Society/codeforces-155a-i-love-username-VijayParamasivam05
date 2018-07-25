import java.io.*;
import java.util.*;
public class Main
{
public static void main(String[] args)throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter n:");
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=Integer.parseInt(br.readLine());
    }
    int count=0;
    for(int i=1;i<n;i++)
    {
        if(a[i]>a[i-1])
        {
            count++;
        }
    }
    System.out.println(count);
}
}

