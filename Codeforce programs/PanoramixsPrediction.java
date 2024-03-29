//Written by Shagoto
import java.util.*;
public class PanoramixsPrediction
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    boolean [] prime = new boolean[50+1];
    for(int i = 0; i<50; i++)
    {
      prime[i] = true;
    }
    
    for(int i = 2; i*i<=50; i++)
    {
      if(prime[i] == true)
      {
        for(int p = i*i; p<=50; p += i)
        {
          prime[p] = false;
        }
      }
    }
    
    for(int i = 2; i<=50; i++)
    {
      if(prime[i] == true)
      {
        arr.add(i);
      }
    }
    
    int n = read.nextInt();
    int m = read.nextInt();
    
    int temp = arr.indexOf(n);
    
    if(m == 50 || n == 47)
    {
      System.out.println("NO");
    }
    else if(arr.get(temp + 1) == m)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}