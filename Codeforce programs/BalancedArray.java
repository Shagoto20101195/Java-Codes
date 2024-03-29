//Written by Shagoto
import java.util.Scanner;
public class BalancedArray
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      
      if(n / 2 % 2 == 1)
      {
        System.out.println("NO");
      }
      else
      {
        int [] even = new int[n / 2];
        even[0] = 2;
        int sumEven = 2;
        for(int i = 1; i<even.length; i++)
        {
          even[i] = even[i-1] + 2;
          sumEven += even[i];
        }
        
        int [] odd = new int[n / 2];
        odd[0] = 1;
        int sumOdd = 1;
        for(int i = 1; i<odd.length; i++)
        {
          if(i == odd.length-1)
          {
            odd[odd.length-1] = sumEven - sumOdd;
            break;
          }
          else
          {
            odd[i] = odd[i-1] + 2;
            sumOdd += odd[i];
          }
        }
        
        System.out.println("YES");
        for(int i = 0; i<even.length; i++)
        {
          System.out.print(even[i]+" ");
        }
        for(int i = 0; i<odd.length; i++)
        {
          System.out.print(odd[i]+" ");
        }
        System.out.println();
      }
    }
  }
}