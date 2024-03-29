import java.util.Scanner;
public class Task08
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter range");
    int n = read.nextInt();
    
    int [] num = new int[n];
    for(int i = 0; i<num.length; i++)
    {
      System.out.println("Enter number");
      num[i] = read.nextInt();
    }
    
    for(int i = 0; i<num.length; i++)
    {
      int min = num[i];
      int minIndex = i;
      
      for(int j = i+1; j<num.length; j++)
      {
        if(num[j] < min)
        {
          min = num[j];
          minIndex = j;
        }
      }
      
      int temp = num[i];
      num[i] = min;
      num[minIndex] = temp;
    }
    
    if(n % 2 == 0)
    {
      int median = (num[n/2] + num[n/2 - 1]) / 2;
      System.out.println("Median = "+median);
    }
    else
    {
      int median = num[(n-1)/2];
      System.out.println("Median = "+median);
    }
  }
}