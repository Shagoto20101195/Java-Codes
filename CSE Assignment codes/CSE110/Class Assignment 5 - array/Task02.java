public class Task02
{
  public static void main(String[]args)
  {
    int [] marks = new int[] {10, 30, 20, 50, 40};
    int sum = 0;
    
    for(int i = 0; i<marks.length; i++)
    {
      sum += marks[i];
    }
    
    int average = sum/marks.length;
    int count = 0;
    for(int i = 0; i<marks.length; i++)
    {
      if(marks[i] > average)
      {
        count ++;
      }
    }
    System.out.println(count+" students are better than average");
    
    for(int i = 0; i<marks.length; i++)
    {
      if(marks[i] > average)
      {
        System.out.println(marks[i]);
      }
    }
  }
}