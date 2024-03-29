//Written by Shagoto
import java.util.Scanner;
public class StonesOnTheTable
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    
    char [] ch = s.toCharArray();
    int count = 0;
    for(int i = 0; i<n-1; i++)
    {
      if(ch[i] == ch[i+1])
      {
        count++;
      }
    }
    
    System.out.println(count);
  }
}