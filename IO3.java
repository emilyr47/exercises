import java.io.File;
import java.util.Scanner;

public class IO3 {
  public static void main (String[]args){
    int length = 15;
    String[] lines = new String[length];
    int count = 0;

    Scanner s;

    Scanner r = new Scanner(System.in);
    String fileName = "";
    System.out.println("Please enter a file name to read: ");
    if (r.hasNext());
      fileName = r.nextLine();

  try {
      s = new Scanner (new File(fileName));
      while (s.hasNext()) {
        lines[count] = s.nextLine();
        count++;
      if (count > 14) {
        break;
      } // if
    } // while
    } // try

    catch (Exception e) {
      System.out.println("File not found");
    } // catch


System.out.println("To lookup a particular line, enter the number, ^d to stop");
while (r.hasNextInt()) {
  int i;
  i = r.nextInt();
  if (i >= 0 && i < lines.length) {
    System.out.print("\nLine " + i + ": ");
    System.out.println(lines[i]);
  } // if
} // while
  System.out.println("\nNext line, ^d to stop: ");
  } // main
} // IO
