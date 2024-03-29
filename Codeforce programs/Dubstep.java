//Written by Shagoto
//It doesn't work in DrJava
//Accepted, but prints space if WUB is present at first
import java.util.*;
public class Dubstep
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    String ans = s.replace("WUB"," ");
    System.out.println(ans);
  }
}