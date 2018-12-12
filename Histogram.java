// examples and ideas taken from original Histogram.java, Weekly Lecture
public class Histogram {
  public static void main (String [] args) {
    int[] hist = new int [101];
    int count;
    //int frequency = hist[index];



count = 0;
while (count < hist.length) {
  hist[count] = 0;
  count++;
}

int counter = 0;
while (counter < args.length) {
  hist[counter] = Integer.valueOf(args[counter]);
  counter ++;
} //while

count = 0;
while (count < hist.length) {
  if( hist[count]!= 0)
System.out.println (hist[count]);
count++;
} // while

int n = 0;
int min = 100;
int max = 0;

count = 0;
while (count < args.length) {
  hist [count] = Integer.valueOf(args[count]);
  count++;
}

count = 0;
while (count < args.length) {
if (hist[count] <= min)
  min = hist[count];
if (hist[count] >=max)
  max = hist[count];
  count++;
} // while

System.out.println ("The biggest score is:"  + max);
System.out.println ("The smallest score is:"  + min);

//Step 4:
int sum = 0;
int maxFrequency = 0;
int index = 0;
//Mean:

  for (int i = 0; i <hist.length; i++) {
  sum = sum + hist [i] * i;
} //for
  double mean = sum / args.length;
  System.out.println("The mean of these scores is: " + mean);

//Mode:

  for (int i = 0; i <hist.length; i++) {
    var i1 = i;
    var i2 = i + 1;
  if (i2 < 101) {
    if (hist[i1] > hist[i2]) {
        maxFrequency = hist[i];
    }
} //if
} //for
  int mode = maxFrequency;
  System.out.println("The mode of these scores is: " + mode);

//Step 5:
//Median:
  for (int i = 0; i <hist.length; i++) {
  sum = sum + hist [i] * i;
  }
  int median = sum / args.length;
  System.out.println("The median of these scores is: " + median);






}//main
} //class
