//Written by Shagoto
import java.util.*;
public class NewYearTransportation
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int t = read.nextInt();
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 0; i<n-1; i++)
    {
      arr.add(read.nextInt());
    }
    
    int pos = 1;
    int index = 0;
    while(pos < t)
    {
      pos += arr.get(index);
      index = pos - 1;
    }
    
    if(pos == t)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}