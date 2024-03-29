import java.util.*;
public class Task8
{
  static int n;
  static String s;
  static Object [] carry;
  
  static int next_holder(int ind)
  {
    if(carry[ind] == null)
    {
      carry[ind] = 1;
      return ind;
    }
    
    return next_holder((ind + 1) % n);
  }
  
  static int winner(int holder, int remain, int ind)
  {
    if(remain == 1)
    {
      return holder;
    }
    
    if(s.charAt(ind) == '2' || s.charAt(ind) == '4')
    {
      carry[holder] = 0;
      return winner(next_holder((holder + 1) % n), remain - 1, (ind + 1) % s.length());
    }
    else
    {
      carry[holder] = null;
      return winner(next_holder((holder + 1) % n), remain, (ind + 1) % s.length());
    }
  }
  
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    n = read.nextInt();
    s = read.next();
    carry = new Object[n];
    carry[0] = 1;
    
    System.out.println(winner(0, n, 0) + 1);
  }
}