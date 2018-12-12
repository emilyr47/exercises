import java.util.Scanner;

public class IO {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in); // create scanner instance
    int count = 0, n;
    String [] words = new String [4];

    /* System.out.printf("\nValue %d - Enter integer (^d to stop): ", ++count);
    while (s.hasNextInt())  {
        n = s.nextInt();
        System.out.printf("Entered: %d\n\n", n);
        System.out.printf("Value number %d: - Enter integer: ", ++count);
    } // hasNext
    System.out.printf("\nOK\n\n");
*/
    s = new Scanner(System.in);
    count = 0;
    System.out.println("String %d - Enter string (^d to stop): ");
    while (s.hasNext() && count < 4)  {
        words[count] = s.nextLine();
        if (words[count].equals("stop")) {
          break;
        }
        //System.out.printf("Entered: %s\n\n", words[count]);
count++;
    } //hasNext
    //System.out.printf("\nOK\n\n");
    for (count = 0; count < words.length; count++)   {
      System.out.println(words[count]);
}
  } // main
} // IO class
