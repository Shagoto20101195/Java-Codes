import java.util.*;
public class RobotProgram
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      int max = Math.max(a, b);
      int min = Math.min(a, b);
      
      if(max - min < 2)
      {
        System.out.println(max + min);
      }
      else
      {
        System.out.println(max * 2 - 1);
      }
    }
  }
}