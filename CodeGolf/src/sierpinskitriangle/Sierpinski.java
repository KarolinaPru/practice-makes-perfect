package sierpinskitriangle;

/*
               ▲ //    [0, 15]
              ▲ ▲
             ▲   ▲
            ▲ ▲ ▲ ▲
           ▲       ▲ // [4, 11] [4, 19] (12, 20) - base
          ▲ ▲     ▲ ▲
         ▲   ▲   ▲   ▲
        ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲
       ▲               ▲
      ▲ ▲             ▲ ▲
     ▲   ▲           ▲   ▲
    ▲ ▲ ▲ ▲         ▲ ▲ ▲ ▲ // [x, 4] - [x, 10]; [x, ] - [x, ]
   ▲       ▲       ▲       ▲
  ▲ ▲     ▲ ▲     ▲ ▲     ▲ ▲
 ▲   ▲   ▲   ▲   ▲   ▲   ▲   ▲
▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲ ▲

*/

public class Sierpinski {

    public int[][] generateFor(int base) {
        int xSize = base * base;
        int ySize = xSize * 2;

        int[][] matrix = new int[xSize][ySize];

        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                if (isBottom(xSize, i, j) || isSide(xSize, i, j)) {
                    matrix[i][j] = 1;
                } else if (i % base == 0 && j % 2 == 1 && (j >= xSize - i - 1) && (j <= xSize + i - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    private static boolean isBottom(int xSize, int i, int j) {
        return i == xSize - 1 && j % 2 == 0;
    }

    private static boolean isSide(int xSize, int i, int j) {
        return j + i == xSize - 1 || j - i == xSize - 1;
    }
}
