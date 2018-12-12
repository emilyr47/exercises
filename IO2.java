import java.io.File;
import java.util.Scanner;

public class IO2 {
  public static void main (String[]args){
    int length = 15;
    String[] lines = new String[length];
    int count = 0;

    Scanner s;

  try {
    s = new Scanner(new File("IO.java"));
    while (s.hasNext()) {
      lines[count] = s.nextLine();
      count++;
    if (count > 14) {
      break;
    }
    }
    for (int index = 0; index < lines.length; index++) {
    System.out.println("line" + index +":   " + lines[index]);
  }
}

  catch (Exception e) {
    System.out.println("File not found");
  }
  } // main
} // IO
