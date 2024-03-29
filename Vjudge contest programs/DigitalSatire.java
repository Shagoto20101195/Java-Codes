//Written by Shagoto
import java.util.Scanner;
public class DigitalSatire
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int T = read.nextInt();
    for(int x = 1; x<=T; x++)
    {
      String sL = "";
      String sR = "";
      int posL = 0;
      int posR =0;
      int tWeightL = 0;
      int tWeightR = 0;
      String [] s = new String [8];
      
      for(int i = 0; i<8; i++)
      {
        if(i == 0)
        {
          read.nextLine();
          s[i] = read.nextLine();
        }
        else
        {
          s[i] = read.nextLine();
        }
      }
      
      for(int i = 3; i<=5; i++)
      {
        char [] ch = s[i].toCharArray();
        for(int j = 0; j<ch.length; j++)
        {
          if(i == 3 || i == 4 || i == 5)
          {
            int value = (int)ch[j];
            
            if(value >= 65 && value <=90 && j < 9)
            {
              sL = sL + ch[j];
              posL = i;
            }
            else if(value >= 65 && value <=90 && j > 9)
            {
              sR = sR + ch[j];
              posR = i;
            }
          }
          else
          {
            break;
          }
        }
      }
      
      char [] left = sL.toCharArray();
      for(int i = 0; i<left.length; i++)
      {
        int value = (int)left[i];
        String temp = "";
        while(value>0)
        {
          int remain = value%2;
          temp = remain + "" + temp;
          value = value / 2;
        }
        
        char [] bin = temp.toCharArray();
        int weight = 0;
        for(int j = 0; j<bin.length; j++)
        {
          if(bin[0] == '0')
          {
          }
          else if(bin[j] == '1')
          {
            weight += 500;
          }
          else if(bin[j] == '0')
          {
            weight += 250;
          }
        }
        tWeightL += weight;
      }
      
      char [] right = sR.toCharArray();
      for(int i = 0; i<right.length; i++)
      {
        int value = (int)right[i];
        String temp = "";
        while(value>0)
        {
          int remain = value%2;
          temp = remain + "" + temp;
          value = value / 2;
        }
        
        char [] bin = temp.toCharArray();
        int weight = 0;
        for(int j = 0; j<bin.length; j++)
        {
          if(bin[0] == '0')
          {
          }
          else if(bin[j] == '1')
          {
            weight += 500;
          }
          else if(bin[j] == '0')
          {
            weight += 250;
          }
        }
        tWeightR += weight;
      }
      
      if(tWeightL > tWeightR && posL > posR)
      {
        System.out.println("Case "+x+":");
        System.out.println("The figure is correct.");
      }
      else if(tWeightL > tWeightR && posL <= posR)
      {
        System.out.println("Case "+x+":");
        
        System.out.println("........||.../\\...");
        System.out.println("........||../..\\..");
        System.out.println(".../\\...||./....\\.");
        System.out.print("../..\\..||/"+sR);
        for(int i = 1; i<=6-sR.length(); i++)
        {
          System.out.print(".");
        }
        System.out.println("\\");
        System.out.println("./....\\.||\\______/");
        System.out.print("/"+sL);
        for(int i = 1; i<=6-sL.length(); i++)
        {
          System.out.print(".");
        }
        System.out.println("\\||........");
        System.out.println("\\______/||........");
      }
      
      else if(tWeightL < tWeightR && posL < posR)
      {
        System.out.println("Case "+x+":");
        System.out.println("The figure is correct.");
      }
      else if(tWeightL < tWeightR && posL >= posR)
      {
        System.out.println("Case "+x+":");
        System.out.println(".../\\...||........");
        System.out.println("../..\\..||........");
        System.out.println("./....\\.||.../\\...");
        System.out.print("/"+sL);
        for(int i = 1; i<=6-sL.length(); i++)
        {
          System.out.print(".");
        }
        System.out.println("\\.||.../\\...");
        System.out.println("\\______/||./....\\.");
        System.out.print("........||/"+sR);
        for(int i = 1; i<=6-sR.length(); i++)
        {
          System.out.print(".");
        }
        System.out.println("\\");
        System.out.println("........||\\______/");
      }
      
      else if(tWeightL == tWeightR && posL == posR)
      {
        System.out.println("Case "+x+":");
        System.out.println("The figure is correct.");
      }
      else if(tWeightL == tWeightR && (posL > posR || posL < posR))
      {
        System.out.println("Case "+x+":");
        System.out.println("........||........");
        System.out.println(".../\\...||.../\\...");
        System.out.println("../..\\..||../..\\..");
        System.out.println("./....\\.||./....\\.");
        System.out.print("/"+sL);
        for(int i = 1; i<=6-sL.length(); i++)
        {
          System.out.print(".");
        }
        System.out.print("\\||/"+sR);
        for(int i = 1; i<=6-sR.length(); i++)
        {
          System.out.print(".");
        }
        System.out.println("\\");
        System.out.println("\\______/||\\______/");
        System.out.println("........||........");
      }
    }
  }
}