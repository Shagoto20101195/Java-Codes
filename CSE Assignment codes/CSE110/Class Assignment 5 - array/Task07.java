public class Task07
{
  public static void main(String[]args)
  {
    int [] a = new int[] {50, 30, 20, 10, 40};
    
    for(int i = 0; i<a.length-1; i++)
    {
      int max = a[i];
      int maxIndex = i;
      for(int j = i+1; j<a.length; j++)
      {
        if(a[j] > max)
        {
          max = a[j];
          maxIndex = j;
        }
      }
      
      int temp = a[i];
      a[i] = max;
      a[maxIndex] = temp;
    }
    
    for(int i = 0; i<a.length; i++)
    {
      System.out.println(a[i]);
    }
  }
}