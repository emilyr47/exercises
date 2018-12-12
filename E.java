public class E {
  public static int fact(int n) {
  //  int n = Integer.valueOf(args[0]);
    int fact = 1;
    int counter = 0;
    if (n < 0) {
      System.out.println("Factorials only defined for values >= 0");
    } // if
    else {
      while (counter < n) {
        counter++;
        fact = fact * counter;
      } // while
      System.out.println("The factorial of "  + n +  " is " + fact);
  }
  return fact;
} // fact n

public static void main(String[]args) {
  int n = Integer.valueOf(args[0]);
  if (n < 0) {
    System.out.println("Error");}

  Rational2 r[] = new Rational2[n];
  for (int index = 0; index < r.length; index++) {
    r[index] = new Rational2(1, fact(index));
  } // for
  double sum = 0;
  for (int index = 0; index < r.length; index++) {
    sum = sum + r[index].toDecimal();
    } // for
    System.out.println(sum);

} // main
} // E
