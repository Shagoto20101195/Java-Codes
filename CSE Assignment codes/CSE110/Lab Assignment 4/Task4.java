public class Task4
{
  public static void main(String[]args)
  {
    int i;
    int total = 0;
    
    for(i=1; i<=600; i=i+1)
    {
      if(i % 7 == 0)
      {
        if(i % 9 == 0)
        {
          
        }
        else
        {
        total = total + i;
        }
      }
      
      
      else if(i % 9 == 0)
      {
        if(i % 7 == 0)
        {
          
        }
        else
        {
          total = total + i;
        }
      }
    }
  System.out.println(total);
  }
}