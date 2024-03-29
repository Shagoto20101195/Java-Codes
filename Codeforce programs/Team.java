//Written by Shagoto
import java.util.Scanner;
public class Team
{  
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    int count = 0;
    
    int x;
    for(x=1; x<=n; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      int c = read.nextInt();
      
      if(a==1 && b==1 && c==1)
      {
        count = count + 1;
      }
      else if(a==1 && (b==1 || c==1))
      {
        count = count + 1;
      }
      else if((a==1 || b==1) && c==1)
      {
        count = count + 1;
      }
      else if((a==1 || c==1) && b==1)
      {
        count = count + 1;
      }
      else
      {
        count = count;
      }
    }
    
    System.out.println(count);
  }
}