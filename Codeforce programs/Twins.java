//Written by Shagoto
import java.util.Scanner;
public class Twins
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int totalAmount = 0;
    int [] value = new int[n];
    for(int i = 0; i<value.length; i++)
    {
      value[i] = read.nextInt();
      totalAmount += value[i];
    }
    
    for(int i = 0; i<value.length-1; i++)
    {
      int max = value[i];
      int maxIndex = i;
      
      for(int j = i+1; j<value.length; j++)
      {
        if(value[j] > max)
        {
          max = value[j];
          maxIndex = j;
        }
      }
      
      int temp = value[i];
      value[i] = max;
      value[maxIndex] = temp;
    }
    
    int count = 0;
    int myAmount = 0;
    for(int i = 0; i<n; i++)
    {
      myAmount += value[i];
      totalAmount -= value[i];
      count++;
      
      if(myAmount <= totalAmount)
      {
        continue;
      }
      else
      {
        break;
      }
    }
    
    System.out.println(count);
  }
}