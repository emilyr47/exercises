public class Rational {

// attributes here
  public int denominator;
  public int numerator;

  // constructors here
  public Rational (int numerator, int denominator) {
    this.numerator = numerator;
      this.denominator = denominator;

    }
  public Rational () {
    this.denominator = 0;
    this.numerator = 0;
  }
     // constructors

      //selectors

      public int getDenominator() {
        return denominator;
      }
      public int getNumerator()   {
        return numerator;
      }

      public void setDenominator(int d){
        d = denominator;
      }
      public void setNumerator(int n){
        n = numerator;
      }

// methods here

public String toString() {
  return numerator + "/" + denominator;
}
// optional: include a main() method to test or demonstrate here

public Rational multiply(Rational r) {
    int n1= (this.numerator);
    int d1= (this.denominator);
    int n2= (r.numerator);
    int d2= (r.denominator);
    int answer = n1*n2;
    int answer1 = d1*d2;
    Rational r4 = new Rational (answer , answer1);
    return r4;


}
public Double toDecimal () {
  return (double) (this.numerator) /(this.denominator);

}

public void reduce() {
  int divisor = 1000;
  if (this.numerator < this.denominator){
    divisor = this.numerator;
  }
  else {
    divisor = this.denominator;
  }


  while (divisor != 1 || this.numerator%divisor != 0 && this.denominator%divisor != 0) {

    if (this.numerator%divisor==0 && this.denominator%divisor==0) {
      numerator = numerator/divisor;
      denominator = denominator/divisor;
      return;
    } // if
    else{
      divisor--;
    }
  }
}

 public Rational add(Rational r) {
   Rational newRational = new Rational();
   int newdenomn;
   int newnum;
   if (this.denominator == r.denominator) {
     newnum = r.numerator + this.numerator;
     newdenomn = r.denominator;
   } // if
   else{
     newdenomn = this.denominator * r.denominator;
     newnum = this.numerator * r.denominator + this.denominator * r.numerator;
     newRational.numerator=newnum;
     newRational.denominator = newdenomn;

   }
   return newRational;
 } // add Rational

 public void copy(Rational anotherRational) {
    anotherRational.denominator = this.denominator;
    anotherRational.numerator = this.numerator;
 } // copy rational

  public Rational clone() {
    Rational cloneRational = new Rational();
    cloneRational.denominator = this.denominator;
    cloneRational.numerator = this.numerator;
    return cloneRational;
  }

public static void main (String[]args) {
  Rational r1 = new Rational(1, 2);
  Rational r2 = new Rational(3, 4);
  Rational r3 = new Rational();
  Rational r4 = new Rational(10,40);
  Rational r5;


// Step 2
    System.out.println(r1.toDecimal());

    r3 = r1.multiply(r2);
    System.out.println(r3.toString());

    r4.reduce();
    System.out.println(r4.toString());

    r3 = r1.add(r2);
    System.out.println(r3.toString());

    r1.copy(r3);
    System.out.println(r3.toString());

    r5 = r2.clone();
    System.out.println(r5.toString());

  } // main
}


// Step 3


// ¼ will be printed (lowest terms of 10/40)


// Step 4




// Step 5
// Step 6
