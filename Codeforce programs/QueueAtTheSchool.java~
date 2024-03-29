//Written by Shagoto
import java.util.Scanner;
public class QueueAtTheSchool
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int t = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    
    char [] ch = s.toCharArray();
    for(int x = 1; x<=t; x++)
    {
      for(int i = 0; i<n-1; i++)
      {
        if(ch[i] == 'B' && ch[i+1] == 'G')
        {
          ch[i] = 'G';
          ch[i+1] = 'B';
          i++;
        }
      }
    }
    
    String ans = new String(ch);
    System.out.println(ans);
  }
}