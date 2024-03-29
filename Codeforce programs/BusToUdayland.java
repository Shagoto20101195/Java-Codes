//Written by Shagoto
import java.util.*;
public class BusToUdayland
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    String [] arr = new String[n];
    read.nextLine();
    
    int index = 0;
    int sitIndex = 0;
    boolean check = false;
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextLine();
      
      if(arr[i].indexOf("OO") > -1 && !check)
      {
        check = true;
        index = i;
        sitIndex = arr[i].indexOf("OO");
      }
    }
    
    if(check)
    {
      System.out.println("YES");
      for(int i = 0; i<n; i++)
      {
        if(i != index)
        {
          System.out.println(arr[i]);
        }
        else
        {
          char [] ch = arr[i].toCharArray();
          for(int j = 0; j<5; j++)
          {
            if(j == sitIndex || j == sitIndex + 1)
            {
              System.out.print("+");
            }
            else
            {
              System.out.print(ch[j]);
            }
          }
          System.out.println();
        }
      }
    }
    else
    {
      System.out.println("NO");
    }
  }
}