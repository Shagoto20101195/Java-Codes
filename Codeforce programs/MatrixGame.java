//Written by Shagoto
import java.util.*;
public class MatrixGame
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int m = read.nextInt();
      int [] sumR = new int[n];
      int [] sumC = new int[m];
      
      for(int i = 0; i<n; i++)
      {
        for(int j = 0; j<m; j++)
        {
          int temp = read.nextInt();
          sumR[i] += temp;
          sumC[j] += temp; 
        }
      }
      
      int count = 0;
      for(int i = 0; i<n; i++)
      {
        for(int j = 0; j<m; j++)
        {
          if(sumR[i] == 0 && sumC[j] == 0)
          {
            sumR[i] = 1;
            sumC[j] = 1;
            count++;
            i = -1;
            break;
          }
        }
      }
      
      if(count % 2 == 1)
      {
        System.out.println("Ashish");
      }
      else
      {
        System.out.println("Vivek");
      }
    }
  }
}