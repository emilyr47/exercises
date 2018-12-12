public class Windchill3 {
  public static void main(String[] args) {
    double tempF; //temperature in F
    double windS; //windspped in mph
    double windT; // windchill temperature in F
    double counter = 0.0;
    tempF = Double.valueOf(args[0]);
    windS = Double.valueOf(args[1]);
    if ( windS < 0.0)
      System.out.println("Error");

    else if ( windS < 4.0)
    {
      System.out.println(tempF);
    }

         else while (windS > counter && counter < 15.0) {
              windT = (0.6215*tempF) - (35.75* (Math.pow(windS, 0.16))) + (0.4275*tempF)*(Math.pow(windS, 0.16)) + 35.74;
            System.out.printf("Temp is %3.1f Wind is %3.1f Windchill = %3.1f\n", tempF, windS, windT);
            counter++;
            windS= windS + 1.0;
          }


  }//main
}//class
