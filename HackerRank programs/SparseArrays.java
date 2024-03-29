//Written by Shagoto
import java.util.*;
public class SparseArrays
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    HashMap<String,Integer> arr = new HashMap<String,Integer>();
    int n = read.nextInt();
    read.nextLine();
    for(int i = 0; i<n; i++)
    {
      String s = read.nextLine();
      
      if(arr.containsKey(s))
      {
        int temp = arr.get(s) + 1;
        arr.put(s,temp);
      }
      else
      {
        arr.put(s,1);
      }
    }
    
    int q = read.nextInt();
    read.nextLine();
    for(int i = 0; i<q; i++)
    {
      String s = read.nextLine();
      
      if(arr.containsKey(s))
      {
        System.out.println(arr.get(s));
      }
      else
      {
        System.out.println(0);
      }
    }
  }
}