public class Q37
{  
  public static void main(String args[])
  {
    int test = 1;
    int j = 0, k = 100;
    while (k > 0){   
      while (j < k ){
        test = k - j + 21;
        System.out.println(1 + test / 2 +"11");
        j+=10;
      }
      k-=10;
    }
  }
}
