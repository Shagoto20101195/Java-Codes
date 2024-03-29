//Written by Shagoto
import java.util.Scanner;
public class NextRound
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int k = read.nextInt();
    int [] score = new int [n];
    
    for(int i = 0; i<score.length; i++)
    {
      score[i] = read.nextInt();
    }
    
    int count = 0;
    for(int i = 0; i<score.length; i++)
    {
      if(score[i] >= score[k-1] && score[i] > 0)
      {
        count++;
      }
    }
    
    System.out.println(count);
  }
}