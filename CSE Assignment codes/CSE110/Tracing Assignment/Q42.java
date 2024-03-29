public class Q42
{  
  public static void main(String args[])
  {
    String test = "";
    int i = 0, j = 0, k = 15;
    test = "<--cat";
    while (i < 5){   
      k-=1;
      j = k;
      while (j > 10 ){
        if (j % 2 == 0){
          test += "-->";
          test =  test + i + (j / 2); 
        }else{
          test += "<--";
          test =  test + (i / 2) + j; 
        }
        System.out.println(test);
        if (j == 12){
           test = "<--cat";
        }
        --j;
      }
      i++;
    }
  }
}
