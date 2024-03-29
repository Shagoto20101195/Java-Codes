public class Q28iii
 {  
  public static void main(String[] args)
  {
    double d = 42;
int x = 5;
int c = 2;
x+= 8;
d/=2;
c = x % c;
System.out.println(c * 2 + d);
d = 1 + d / c + 21; 
System.out.println(d / 2 + 3 + "c");

  }
}