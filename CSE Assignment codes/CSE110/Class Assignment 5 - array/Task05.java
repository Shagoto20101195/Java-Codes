public class Task05
{
  public static void main(String[]args)
  {
    int [] a = new int[] {50, 30, 20, 10, 40};
    int max = 0;
    int maxIndex = 0;
    
    for(int i = 1; i<a.length; i++)
    {
      if(a[i] > max)
      {
        max = a[i];
        maxIndex = i;
      }
    }
    
    int temp = a[1];
    a[1] = max;
    a[maxIndex] = temp;
    
    for(int i = 0; i<a.length; i++)
    {
      System.out.println(a[i]);
    }
  }
}