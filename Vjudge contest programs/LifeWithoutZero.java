//Written by Shagoto
import java.util.Scanner;
public class LifeWithoutZero
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int a = read.nextInt();
    int b = read.nextInt();
    int c = a + b;
    
    char [] aArray = (""+a).toCharArray();
    char [] bArray = (""+b).toCharArray();
    char [] cArray = (""+c).toCharArray();
    
    char [] check1 = new char [aArray.length];
    int countA = 0;
    for(int i = 0; i<aArray.length; i++)
    {
      if(aArray[i] != '0')
      {
        check1[countA] = aArray[i];
        countA++;
      }
    }
    char [] newA = new char [countA];
    for(int i = 0; i<newA.length; i++)
    {
      newA[i] = check1[i];
    }
    
    char [] check2 = new char [bArray.length];
    int countB = 0;
    for(int i = 0; i<bArray.length; i++)
    {
      if(bArray[i] != '0')
      {
        check2[countB] = bArray[i];
        countB++;
      }
    }
    char [] newB = new char [countB];
    for(int i = 0; i<newB.length; i++)
    {
      newB[i] = check2[i];
    }
    
    char [] check3 = new char [cArray.length];
    int countC = 0;
    for(int i = 0; i<cArray.length; i++)
    {
      if(cArray[i] != '0')
      {
        check3[countC] = cArray[i];
        countC++;
      }
    }
    char [] newC = new char [countC];
    for(int i = 0; i<newC.length; i++)
    {
      newC[i] = check3[i];
    }
     
    String sA = new String (newA);
    String sB = new String (newB);
    String sC = new String (newC);
    
    a = Integer.parseInt(sA);
    b = Integer.parseInt(sB);
    c = Integer.parseInt(sC);
    
    if(a + b == c)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}