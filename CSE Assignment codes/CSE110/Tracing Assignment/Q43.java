public class Q43
{  
  public static void main(String args[])
  {
    String test = "";
    int i = 2, j = 0, k = 17;
    test = "-->dog";
    while (i < 7){   
      k-=1;
      j = k;
      while (j > 12 ){
        if (j % 2 == 0){
          test += "<--";
          test =  test + i + (j / 2); 
        }else{
          test += "-->";
          test =  test + (i / 2) + j; 
        }
        System.out.println(test);
        if (j == 14){
           test = "-->dog";
        }        
        --j;
      }
      i++;
    }
  }
}
