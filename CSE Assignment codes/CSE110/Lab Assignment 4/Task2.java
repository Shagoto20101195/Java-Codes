public class Task2
{
  public static void main(String[]args)
  {
    int i;
    int sum = 0;
    for(i=1; i<=600; i=i+1)
    {
      if(i % 7 == 0)
      {
        if(i % 9 == 0)
        {
          sum = sum + i;
        }
      }
    }
    
    System.out.println(sum);
  }
}