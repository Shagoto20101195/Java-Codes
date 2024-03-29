public class Task04
{
  public static void main(String[]args)
  {
    float num = 1;
    float den = 25;
    float sum = 0;
    
    while(den <= 225)
    {
      sum = sum + (num*num/den);
      num = num + 1;
      den = den + 25;
    }
    
    System.out.println("Sum = "+sum);
  }
}