//Written by Shagoto
import java.util.Scanner;
public class CandiesandSister
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
   
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
     
      if(n==1 || n==2)
      {
        System.out.println(0);
      }
      else if(n % 2 == 0)
      {
        System.out.println((n/2) - 1);
      }
      else if(n % 2 == 1)
      {
        System.out.println(n/2);
      }
    }
  }
}