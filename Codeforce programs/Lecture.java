//Written by Shagoto
import java.util.*;
public class Lecture
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    HashMap<String,String> arr = new HashMap<String,String>();
    int n = read.nextInt();
    int m = read.nextInt();
    read.nextLine();
    
    for(int i = 0; i<m; i++)
    {
      String [] in = (read.nextLine()).split(" ");
      
      if(in[0].length() < in[1].length())
      {
        arr.put(in[0],in[0]);
        arr.put(in[1],in[0]);
      }
      else if(in[0].length() > in[1].length())
      {
        arr.put(in[0],in[1]);
        arr.put(in[1],in[1]);
      }
      else
      {
        arr.put(in[0],in[0]);
        arr.put(in[1],in[0]);
      }
    }
    
    String s = read.nextLine();
    String [] temp = s.split(" ");
    
    for(int i = 0; i<n; i++)
    {
      System.out.print(arr.get(temp[i])+" ");
    }
    System.out.println();
  }
}