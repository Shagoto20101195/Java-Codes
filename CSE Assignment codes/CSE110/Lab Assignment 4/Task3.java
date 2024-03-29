public class Task3
{
  public static void main(String[]args)
  {
    int sum = 0;
    int i;
    for(i=1; i<=600; i=i+1)
    {
      if(i % 7 == 0)
      {
        if(i % 9 == 0)
        {
        }
        
        else
        {
          sum = sum + i;
        }
      }
      
      
      
      if(i % 9 == 0)
      {
        if(i % 7 == 0)
        {
          sum = sum + i;
        }
        
        else
        {
          sum = sum + 1;
        }
      }
      
    }
    System.out.println(sum);
  }
}
