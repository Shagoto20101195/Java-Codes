import java.util.*;
public class UniqueBidAuction
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] arr = new int[n+1];
      int [] index = new int[n+1];
      for(int i = 0; i<n; i++)
      {
        int num = read.nextInt();
        arr[num]++;
        
        if(index[num] == 0)
        {
          index[num] = i+1;
        }
      }
      
      boolean check = true;
      for(int i = 1; i<=n; i++)
      {
        if(arr[i] == 1)
        {
          System.out.println(index[i]);
          check = false;
          break;
        }
      }
      
      if(check)
      {
        System.out.println(-1);
      } 
    }
  }
}