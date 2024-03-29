//Written by Shagoto
import java.util.*;
public class PoliceRecruits
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int count = 0;
    int cop = 0;
    for(int i = 0; i<n; i++)
    {
      int temp = read.nextInt();
      
      if(temp == -1 && cop == 0)
      {
        count++;
      }
      else if(temp == -1 && cop > 0)
      {
        cop--;
      }
      else
      {
        cop += temp;
      }
    }
    
    System.out.println(count);
  }
}