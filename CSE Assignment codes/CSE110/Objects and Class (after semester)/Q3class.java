public class Q3class
{
  double height, width, area;
  
  public void setHeight(int x)
  {
    height = x;
  }
  
  public double getHeight()
  {
    return height;
  }
  
  public void setWidth(int y)
  {
    width = y;
  }
  
  public double getWidth()
  {
    return width;
  }
  
  public double getArea()
  {
    area = height*width;
    return area;
  }
}