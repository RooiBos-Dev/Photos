import java.io.*;
import java.util.*;

public class MainActivity {

  public static void main(String[] args){

    Vector v = new Vector();
  // This is where we need to read the text file
  File file = new File("/home/mansa/Desktop/Google_Hash_Code/a_example.txt");
  try{

    Scanner sc = new Scanner(file);
    // The following code reads the first line of the input file
      // and converts it to an integer array at the end.

      String inputFormat = sc.nextLine();
      int num_photos = Integer.parseInt(inputFormat);
      String dimension;
      int num_tags;
      for (int i = 0; i < num_photos; i++){
        inputFormat = sc.nextLine();
        String[] photo = inputFormat.split(" ");
        dimension = photo[0];
        num_tags = Integer.parseInt(photo[1]);
        ArrayList<String> arr = new ArrayList<String>();
        for( int j = 0; j< photo.length; j++){
            arr.add(photo[j]);
        }
        arr.remove(0);
        arr.remove(0);



}
catch (FileNotFoundException ex)
{
  System.out.println("File does not exist");
}

}
}
