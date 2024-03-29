//Written by Shagoto
import java.util.Scanner;
public class BeautifulMatrix
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int [][] a = new int [5][5];
    int row = 0;
    int col = 0;
    int count = 0;
    
    for(int i = 0; i<5; i++)
    {
      for(int j = 0; j<5; j++)
      {
        a[i][j] = read.nextInt();
        if(a[i][j] == 1)
        {
          row = i;
          col = j;
        }
      }
    }
    
    if(row == 2 && col == 2)
    {
      System.out.println(count);
    }
    else
    {
      for(int i = row; i<2; i++)
      {
        count++;
      }
      for(int i = row; i>2; i--)
      {
        count++;
      }
      for(int i = col; i<2; i++)
      {
        count++;
      }
      for(int i = col; i>2; i--)
      {
        count++;
      }
      
      System.out.println(count);
    }
  }
}