public class a4
{
  public static void main(String[]args)
  {
    int a;
    int x = 9;
    int i;
    for(i=2; i<=7; i=i+1)
    {
      if(i % 2 == 0)
      {
        a = x * i;
        System.out.println(a);
      }
      
      else
      {
        a = x * -i;
        System.out.println(a);
      }
    }
    
  }
}