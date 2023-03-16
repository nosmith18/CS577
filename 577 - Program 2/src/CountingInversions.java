import java.util.Scanner;

public class CountingInversions {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // Get Length
    int len = Integer.parseInt(in.nextLine());
    
    // Initialize arrays and read values
    int[] a = new int[len];
    int[] b = new int[len];
    int[][] arr = new int[][] {a,b};
    for (int i=0; i<2; i++) {
      for (int j=0; j<len; j++) {
        arr[i][j] = Integer.parseInt(in.nextLine());
      }
    }
    
    // Close 
    in.close();
    
    inversions(a,b);
  }
  
  private static void inversions(int[] a, int[] b) {
    int len = a.length;
    long count = 0;
    // Calculate inversions
    for (int i=0; i<len; i++) {
      for (int j=i+1; j<len; j++) {
        if (a[i] < a[j] && b[j] < b[i]) {
          count++;
        } else if (a[i] > a[j] && b[j] > b[i]) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
  
}
