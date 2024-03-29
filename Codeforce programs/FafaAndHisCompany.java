//Written by Shagoto
import java.util.*;
public class FafaAndHisCompany
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int count = 0;
    for(int i = 1; i<n; i++)
    {
      if(n % i == 0)
      {
        count++;
      }
    }
    
    System.out.println(count);
  }
}