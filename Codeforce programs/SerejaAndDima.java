//Written by Shagoto
import java.util.*;
public class SerejaAndDima
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int n = read.nextInt();
    for(int i = 0; i<n; i++)
    {
      arr.add(read.nextInt());
    }
    
    int sS = 0;
    int sD = 0;
    int count = 0;
    while(arr.size() > 0)
    {
      int temp = Math.max(arr.get(0), arr.get(arr.size() - 1));
      arr.remove(arr.indexOf(temp));
      
      if(count % 2 == 0)
      {
        sS += temp;
      }
      else
      {
        sD += temp;
      }
      
      count++;
    }
    
    System.out.println(sS+" "+sD);
  }
}