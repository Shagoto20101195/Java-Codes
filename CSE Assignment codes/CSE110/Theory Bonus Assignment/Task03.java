public class Task03
{
  public static void main(String[]args)
  {
    int num = 25;
    long product = 1;
    int count = 1;
    
    while(num <= 225)
    {
      if(count % 3 == 0)
      {
        int minusNum = -1 * num;
        System.out.println(minusNum);
        product = product * minusNum;
      }
      
      else
      {
        System.out.println(num);
        product = product * num;
      }
      
      count = count + 1;
      num = num + 25;
    }
    
    System.out.println("Product = "+product);
  }
}