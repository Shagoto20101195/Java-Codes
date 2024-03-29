//Written by Shagoto
import java.util.*;
public class MoveBrackets
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      Stack<Character> arr = new Stack<Character>();
      int n = read.nextInt();
      read.nextLine();
      String s = read.nextLine();
      int count = 0;
      
      for(int i = 0; i<n; i++)
      {
        if(s.charAt(i) == '(')
        {
          arr.push(s.charAt(i));
        }
        else if(s.charAt(i) == ')' && !arr.empty())
        {
          arr.pop();
        }
        else
        {
          count++;
        }
      }
      
      System.out.println(count);
    }
  }
}