public class Rational2 extends Rational {
  // attributes
  private static int count = 1;
  private int index;

  // constructors
  public Rational2 (int numerator, int denominator) {
    super (numerator, denominator);
    index = count++;
  //  index =index++;
  } // Rational1

  public Rational2 () {
    super();
    index = count++;
    //index= index++;
  } // Rational2

  public int getIndex() {
    //System.out.println("The index is: " + r1.getIndex() );
    return index;
     } // get index

  public String toString() {
    // System.out.println("The index is: " + r1.getIndex() );
        return numerator + "/" + denominator;
  } //toString

public static void main(String[] args) {
  Rational2 r1 = new Rational2(1, 2);
  Rational2 r2 = new Rational2(3, 4);
  Object r3 = new Rational2(5, 6);
  System.out.println("The index of r1 is: " + r1.getIndex() );
  System.out.println("The index of r2 is: " + r2.getIndex() );
} // main

} // Rational2
