public class Q3
{
  public static void main(String[]args)
  {
    double h, w, a;
    Q3class s1 = new Q3class();
    s1.setHeight(3);
    s1.setWidth(4);
    h = s1.getHeight();
    w = s1.getWidth();
    a = s1.getArea();
    System.out.println("Height = "+ h); 
    System.out.println("Width = "+ w);
    System.out.println("Area = "+ a);
  }
}