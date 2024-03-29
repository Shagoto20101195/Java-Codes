import java.io.*;
public class TesterClass
{
  public static void main(String [] args) throws IOException
  {
    // Enter file name
    BufferedReader file1 = new BufferedReader(new FileReader("input.txt")); // Do Not Change
    System.out.println(file1.readLine()); // Do Not Change
    
    file1.close();
    FileWriter file2 = new FileWriter("output.txt");
    file2.write("Hello\n");
    file2.write("Hi");
    file2.close();
  }
}