import java.io.*;
import java.util.*;

public class MainActivity extends Photo{

  public static void main(String[] args){

    Vector v = new Vector
  // This is where we need to read the text file
  File file = new File("/home/mansa/Desktop/Google_Hash_Code/a_example.txt");
  try{

    Scanner sc = new Scanner(file);
    // The following code reads the first line of the input file
      // and converts it to an integer array at the end.

      String inputFormat = sc.nextLine();
      int num_photos = Integer.parseInt(inputFormat);
      for (int i = 0; i < num_photos; i++){
        inputFormat = sc.nextLine();
        String[] photo = inputFormat.split(" ");
        int index 
        Photo obj = new Photo(photo[0],)

      }


}
catch (FileNotFoundException ex)
{
  System.out.println("File does not exist");
}

}
