//Written by Shagoto
import java.util.*;
public class IlyaAndBankAccount
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int n = read.nextInt();
    arr.add(n);
    
    char [] ch = (""+n).toCharArray();
    String temp1 = "";
    for(int i = 0; i<ch.length; i++)
    {
      if(i < ch.length - 1)
      {
        temp1 += "" + ch[i];
      }
    }
    
    if(temp1.equals("-0"))
    {
      arr.add(0);
    }
    else
    {
      arr.add(Integer.parseInt(temp1));
    }
    
    String temp2 = "";
    for(int i = 0; i<ch.length; i++)
    {
      if(i != ch.length - 2)
      {
        temp2 += "" + ch[i];
      }
    }
    
    if(temp2.equals("-0"))
    {
      arr.add(0);
    }
    else
    {
      arr.add(Integer.parseInt(temp2));
    }
    
    Collections.sort(arr);
    System.out.println(arr.get(2));
  }
}