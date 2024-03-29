import java.io.*;
public class FastOutputWriter
{
  public static void main(String [] args) throws IOException
  {
    BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    output.write("Hello World");
    output.write("\n");
    output.flush(); // Flush to show stored output
  }
}