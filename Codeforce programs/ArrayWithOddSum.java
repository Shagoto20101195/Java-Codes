//Written by Shagoto
import java.util.*;
public class ArrayWithOddSum
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] arr = new int[n];
      int oddCount = 0;
      int evenCount = 0;
      int sum = 0;
      
      for(int i = 0; i<n; i++)
      {
        arr[i] = read.nextInt();
        sum += arr[i];
        
        if(arr[i] % 2 == 1)
        {
          oddCount++;
        }
        else
        {
          evenCount++;
        }
      }
      
      if(sum % 2 == 1)
      {
        System.out.println("YES");
      }
      else if(oddCount % 2 == 0 && evenCount > 0 && oddCount > 0)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}