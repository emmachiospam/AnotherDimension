public class Tester {

  public static void main(String[] args) {
    int[][] a = {{1,2,10}, {2,2,2}, {2,3,4}};
    // System.out.println(ArrayOps.sum(a));
    // System.out.println(ArrayOps.largest(a));
    // System.out.println(arrToString(ArrayOps.sumRows(a)));
    System.out.println(arrToString(ArrayOps.largestInRows(a)));
  }

  public static String arrToString(int[] arr){
  String result = "{";
  if(arr.length > 0) {
    for(int i = 0; i < arr.length-1; i++) {
      result = result + Integer.toString(arr[i]);
      result = result + ", ";
    }
    result = result + Integer.toString(arr[arr.length-1]);
  }
  result = result + "}";
  return result;
  }

}
