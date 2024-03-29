//Written by Shagoto
import java.util.Scanner;
public class Taxi
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] num = new int[n];
    int taxiNum = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    
    for(int i = 0; i<n; i++)
    {
      num[i] = read.nextInt();
      if(num[i] == 1)
      {
        count1++;
      }
      else if(num[i] == 2)
      {
        count2++;
      }
      else if(num[i] == 3)
      {
        count3++;
      }
      else if(num[i] == 4)
      {
        taxiNum++;
      }
    }
    
    int remain1 = 0;
    int remain2 = 0;
    
    if(count1 == count3)
    {
      taxiNum = taxiNum + ((count3+count1) / 2);
    }
    else
    {
      if(count3 > count1)
      {
        taxiNum = taxiNum + ((count3 - count1) + count1);
      }
      else
      {
        taxiNum = taxiNum + count3;
        remain1 = count1 - count3;
      }
    }
    
    if(count2 % 2 == 0)
    {
      taxiNum = taxiNum + (count2 / 2);
      if(remain1 % 4 == 0)
      {
        taxiNum = taxiNum + (remain1 / 4);
      }
      else
      {
        taxiNum = taxiNum + (remain1 / 4) + 1;
      }
    }
    else
    {
      taxiNum = taxiNum + (count2 / 2);
      remain2 = 2;
      if(remain1 <= remain2)
      {
        taxiNum++;
      }
      else
      {
        int temp = remain1 - remain2;
        taxiNum++;
        if(temp % 4 == 0)
        {
          taxiNum = taxiNum + (temp / 4);
        }
        else
        {
          taxiNum = taxiNum + (temp / 4) + 1;
        }
      }
    }
    
    System.out.println(taxiNum);
  }
}