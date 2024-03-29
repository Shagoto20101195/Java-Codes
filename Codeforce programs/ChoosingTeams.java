//Written by Shagoto
import java.util.*;
public class ChoosingTeams
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int k = read.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    for(int i = 0; i<n; i++)
    {
      arr.add(read.nextInt());
    }
    
    Collections.sort(arr);
    
    int count = 0;
    for(int i = 0; i<n; i++)
    {
      if(arr.get(i) + k <= 5)
      {
        count++;
      }
    }
    
    System.out.println(count / 3);
  }
}