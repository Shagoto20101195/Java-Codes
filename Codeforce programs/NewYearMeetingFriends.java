//Written by Shagoto
import java.util.Scanner;
public class NewYearMeetingFriends
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int x = read.nextInt();
    int y = read.nextInt();
    int z = read.nextInt();
    
    int max=0;
    int min=0;
    int avg=0;
    
    if(x>y)
    {
      if(x>z)
      {
        max=x;
        
        if(y>z)
        {
          avg=y;
          min=z;
        }
        else
        {
          avg=z;
          min=y;
        }
      }
    }
    
    if(y>x)
    {
      if(y>z)
      {
        max=y;
        
        if(x>z)
        {
          avg=x;
          min=z;
        }
        else
        {
          avg=z;
          min=x;
        }
      }
    }
    
    if(z>x)
    {
      if(z>y)
      {
        max=z;
        
        if(x>y)
        {
          avg=x;
          min=y;
        }
        else
        {
          avg=y;
          min=x;
        }
      }
    }
    
    System.out.println(max - avg + avg - min);
  }
}