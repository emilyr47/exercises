public class Picture {
  public static int randomInt(int min, int max){
    return (int)((Math.random()*(max-min)+1) + min);
  }
  public static void main (String[]args) {
    int rows = Integer.valueOf(args[0]);
    int col = Integer.valueOf(args[1]);
    int npix = Integer.valueOf(args[2]);
    int indexRow;
    int indexCol;
    int n;
    char[][] pic;
    int randomrow;
    int randomcol;


  if (rows > 1 && col > 1) {
    pic = new char[rows][col];
    for (indexRow = 0; indexRow < rows; indexRow ++)
    {
      for (indexCol = 0; indexCol < col; indexCol++)
      {
        pic[indexRow][indexCol] = ' ';
      }

    }


    for (n = 0; n < npix;n++) {
      randomrow = randomInt(0, rows - 1);
      randomcol = randomInt(0, col - 1);
      pic[randomrow][randomcol] = '*';
    }

    for (indexRow = 0; indexRow < rows; indexRow ++)
    {
      for (indexCol = 0; indexCol < col; indexCol++)
      {
        System.out.print(pic[indexRow][indexCol]);
      }
      System.out.println();
    }
  }
  else{
      System.out.println("Enter numbers bigger than 1");
    }




  }//main
} //class
