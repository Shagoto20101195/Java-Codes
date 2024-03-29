public class Task17
{
  public static void main(String[]args)
  {
    int num1 = 0;
    int num2 = 1;
    int sum = num1 + num2;
    
    System.out.println(num1);
    System.out.println(num2);
    
    while(sum<1600)
    {
      System.out.println(sum);
      
      num1 = num2;
      num2 = sum;
      sum = num1 + num2;
    }
  }
}