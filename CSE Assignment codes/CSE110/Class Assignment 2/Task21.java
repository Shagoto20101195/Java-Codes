import java.util.Scanner;
public class Task21
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int mynum = num;
    int digit = 1;
    int remain1 = 0;
    int x;
    for(x=1; x<=num; x++)
    {
      remain1 = num / 10;
      
      if(remain1 > 0)
      {
        num = remain1;
        digit = digit + 1;
      }
    }
    
    digit = digit - 1;
    int total = 1;
    int value = 10;
    int y;
    for(y=1; y<=digit; y++)
    {
      total = total * value;
    }
    
    digit = digit + 1;
    int remain2 = 0;
    int z;
    for(z=1; z<=digit; z++)
    {
      remain2 = mynum / total;
      System.out.println(remain2);
      mynum = mynum % total;
      total = total / 10;
    }
  }
}