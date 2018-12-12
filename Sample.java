import java.util.Scanner;
import java.io.File;

public class Sample {
  public static void main (String[]args) {
  File myDir = new File ("/Users/emily/desktop/java/labs");
  File [] fileList = myDir.listFiles();
  String [] arr = new String [4];
  int n = 0;

  Scanner s;

  for (int i = 0; i < fileList.length; i++) {
    String filename = fileList[i].getName();
    if (filename.endsWith(".java")) {
      try {
        s = new Scanner (new File(filename));

      if (n < arr.length) {
        arr[n] = s.nextLine();
        n++;
      }
      } // try
      catch (Exception e) {
        System.out.println("File not found");
      } // catch
    } // if
} // for
  for (int i = 0; i < fileList.length; i++) {
    if (arr[i] != null) {
    System.out.println("Line " + i + "is " + arr[i]);
  }
  } // for
} // main
} // class
