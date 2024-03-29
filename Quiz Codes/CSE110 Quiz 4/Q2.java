import java.util.Scanner;
public class Q2
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int [] a = new int[100];
    for(int i = 0; i<a.length; i++)
    {
      System.out.println("Enter number");
      a[i] = read.nextInt();
    }
    
    int min = 0;
    int minIndex = 0;
    int temp = 0;
    
    for(int i = 0; i<a.length; i++)
    {
      min = a[i];
      minIndex = i;
      
      for(int j = i+1; j<a.length; j++)
      {
        if(a[j] < min)
        {
          min = a[j];
          minIndex = j;
        }
      }
      
      temp = a[i];
      a[i] = min;
      a[minIndex] = temp;
    }
    
    System.out.println(a[26]);
  }
}