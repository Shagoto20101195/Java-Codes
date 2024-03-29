//Written by Shagoto
import java.util.Scanner;
public class JollyJumpers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    while(read.hasNext())
    {
      int n = read.nextInt();
      int [] num = new int [n];
      int [] dif = new int[n-1];
      int count = 0;
      int max = 0;
      
      for(int i = 0; i<num.length; i++)
      {
        num[i] = read.nextInt();
      }
      
      for(int i = 0; i<dif.length; i++)
      {
        if(num[i] < num[i+1])
        {
          dif[i] = num[i+1] - num[i];
          if(dif[i] > max)
          {
            max = dif[i];
          }
        }
        
        else
        {
          dif[i] = num[i] - num[i+1];
          if(dif[i] > max)
          {
            max = dif[i];
          }
        }
      }
      
      for(int i = 0; i<dif.length-1; i++)
      {
        int min = dif[i];
        int minIndex = i;
        for(int j = i+1; j<dif.length; j++)
        {
          if(dif[j] < min)
          {
            min = dif[j];
            minIndex = j;
          }
        }
        int temp = dif[i];
        dif[i] = min;
        dif[minIndex] = temp;
      }

      for(int i = 0; i<n-1; i++)
      {
        if(dif[0] != 1 || dif[dif.length-1] != n-1)
        {
          break;
        }
        else
        {
          if((i+1) == dif[i])
          {
            count++;
          }
        }
      }
      
      if(count == n-1)
      {
        System.out.println("Jolly");
      }
      else
      {
        System.out.println("Not jolly");
      }
    }
  }
}