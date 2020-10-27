public class ArrayOps{

  public static void main(String[] args) {
  }

  public static int sum(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int max = arr[0];
    for(int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] sumMatrix = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++) {
      sumMatrix[i] = sum(matrix[i]);
    }
    return sumMatrix;
  }

  public static  int[] largestInRows(int[][] matrix) {
    int[] largestMatrix = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++) {
      largestMatrix[i] = largest(matrix[i]);
    }
    return largestMatrix;
  }

  public static int sum(int[][] arr) {
    int[] totalSumMatrix = sumRows(arr);
    int sum = sum(totalSumMatrix);
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] colsSumMatrix = new int[matrix[0].length];
    for(int i = 0; i < matrix[0].length; i++) {
      int sum = 0;
      for(int j = 0; j < matrix.length; j++) {
        sum = sum + matrix[j][i];
      }
      colsSumMatrix[i] = sum;
    }
    return colsSumMatrix;
  }


  public static boolean isRowMagic(int[][] matrix) {
    int[] testMatrix = sumRows(matrix);
    for(int i = 0; i < testMatrix.length; i++) {
      if (testMatrix[0] != testMatrix[i]) {
        return false;
      }
    }
    return true;
  }


  public static boolean isColMagic(int[][] matrix) {
    int[] testMatrix2 = sumCols(matrix);
    for(int i = 0; i < testMatrix2.length; i++) {
      if (testMatrix2[0] != testMatrix2[i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int rowSum = sum(matrix[row]);
    int rowCol = sumCols(matrix)[col];
    return rowSum == rowCol;
  }

}
