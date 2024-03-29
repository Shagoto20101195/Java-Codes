import java.util.*;
public class Task3
{
  static int hocBuilder(int height)
  {
    if(height == 0)
    {
      return 0;
    }
    
    if(height == 1)
    {
      return 8;
    }
    
    return hocBuilder(height - 1) + 5;
  }
  
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    System.out.println(hocBuilder(n));
  }
}