import java.util.Scanner;
public class Task23
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
      
      if(remain2 == 0) System.out.println("zero");
      if(remain2 == 1) System.out.println("one");
      if(remain2 == 2) System.out.println("two");
      if(remain2 == 3) System.out.println("three");
      if(remain2 == 4) System.out.println("four");
      if(remain2 == 5) System.out.println("five");
      if(remain2 == 6) System.out.println("six");
      if(remain2 == 7) System.out.println("seven");
      if(remain2 == 8) System.out.println("eight");
      if(remain2 == 9) System.out.println("nine");
      
      mynum = mynum % total;
      total = total / 10;
    }
  }
}