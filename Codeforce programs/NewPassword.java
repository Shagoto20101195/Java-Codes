//Written by Shagoto
import java.util.*;
public class NewPassword
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int k = read.nextInt();
    int temp1 = 97;
    int temp2 = 0;
    String ans = "";
    
    for(int i = 0; i<k; i++)
    {
      ans = ans + (char)temp1;
      temp1++;
    }
    
    if(n == k)
    {
      System.out.println(ans);
    }
    else
    {
      for(int i = 0; i<n-k; i++)
      {
        if(temp2 % 2 == 0)
        {
          ans = ans + "a";
          temp2++;
        }
        else
        {
          ans = ans + "b";
          temp2++;
        }
      }
      System.out.println(ans);
    }
  }
}