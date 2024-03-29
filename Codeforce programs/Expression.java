//Written by Shagoto
import java.util.Scanner;
public class Expression
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int a = read.nextInt();
    int b = read.nextInt();
    int c = read.nextInt();
    
    int [] v = new int[5];
    v[0] = a + b * c;
    v[1] = a * (b+c);
    v[2] = a * b * c;
    v[3] = (a+b) * c;
    v[4] = a + b + c;
    
    int max = 0;
    for(int i = 0; i<v.length; i++)
    {
      if(v[i] > max)
      {
        max = v[i];
      }
    }
    
    System.out.println(max);
  }
}