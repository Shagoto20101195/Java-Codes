//Written by Shagoto
import java.util.*;
public class BusinessTrip
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int k = read.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 0; i<12; i++)
    {
      arr.add(read.nextInt());
    }
    
    int sum = 0;
    int count = 0;
    Collections.sort(arr, Collections.reverseOrder());
    
    for(int i = 0; sum < k; i++)
    {
      sum += arr.get(i);
      count++;
      
      if(i == 11)
      {
        break;
      }
    }
    
    if(sum < k)
    {
      System.out.println(-1);
    }
    else
    {
      System.out.println(count);
    }
  }
}