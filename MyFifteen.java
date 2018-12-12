public class MyFifteen {
    public static void main (String[]args) {
    final int NROWS = 4;
    final  int NCOLS = 4;
    int[][]p = new int[NROWS][NCOLS];
    initSolution(p);
    printPuzzle(p);
    int [][]p2 = new int [NROWS][NCOLS];
    initSolution (p2);
    p2 [3][3] = 15;
    if (puzzleEqual(p, p2)==true) {
      System.out.println("Puzzles match");
    }
    else {
      System.out.println("Puzzles don't match");
    }



}//main

public static void initSolution(int[][] p){




  int row;
  int col;




  for (row = 0; row < p.length; row ++){
    for (col = 0; col < p[row].length; col++) {
      p[row][col] = row * p[row].length + col + 1;
    }
} //for
p[3][3]=0;
}
/*
for (row = 0; row < p.length; row++)
for (col = 0; col < p[row].length; col++)
  p[row][col] = 0;
      initSolution (p);
      printanotherPuzzle (p);
      System.out.println();
} //void

*/

public static void printPuzzle(int[][] p){
int row;
int col;


for (row = 0; row < p.length; row++) {
for (col = 0; col < p[row].length; col++)
System.out.printf("%4d   ", p[row][col]);
System.out.println();
}//for
System.out.println();

}//printPuzzle



public static boolean puzzleEqual(int[][] p, int[][]b) {

  int row;
  int col;


  for (row = 0; row < p.length; row++) {
  for (col = 0; col < p[row].length; col++) {

if (b[row][col] !=p[row][col]) {
    return false; }
  }
}

  return true;
}
}







//taken from Fifteen.java
