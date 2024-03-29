// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class GuessTheNumber
{
  static boolean queries(int x, Scanner read)
  {
    System.out.println(x);
    System.out.flush();
    String s = read.nextLine();
    
    if(s.equals("<"))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int low = 1;
    int high = 1000000;
    
    while(low < high)
    {
      int mid = (low + high + 1) / 2;
      
      if(queries(mid, read))
      {
        high = mid - 1;
      }
      else
      {
        low = mid;
      }
    }
    
    System.out.println("! "+low);
    System.out.flush();
  }
}