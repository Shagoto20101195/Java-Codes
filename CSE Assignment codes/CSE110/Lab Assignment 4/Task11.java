public class Task11
{
  public static void main(String[]args)
  {
    int x;
    for(x=40; x<=50; x++)
    {
      int i;
      int count = 0;
      for(i=1; i<=x; i++)
      {
       
        if(x % i == 0)
        {
          count = count + 1;
        }
      }
      
      if(count == 2)
      {
        System.out.println(x);
      }
    }
  }
}