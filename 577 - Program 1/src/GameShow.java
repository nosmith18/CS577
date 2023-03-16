import java.util.Scanner;

/*
 * Author: Nolan Smith
 * Email: nosmith@wisc.edu
 * Course: CS577
 */

public class GameShow {

  public static void main(String[] args) {
    
    // Scanner
    Scanner in = new Scanner(System.in);
    int length = in.nextInt();
    
    int[] nums = new int[length];
    for (int i = 0; i < length; i++) {
      nums[i] = in.nextInt();
    }
    in.close();
    
//    System.out.println("Nums[length-1] = " + nums[length-1]);
//    System.out.println("Nums[0] = " + nums[0]);

    System.out.println(findMax(nums));
  }

  public static int findMax(int[] nums) {
    
    int maxProfit = 0;
    int curr = 0; 
    
    // Start counting at first index
    for (int i = 0; i < nums.length; i++) {
      // Count from index i through the rest of the array for the Profit value
      for (int j = i; j < nums.length; j++) {
        curr += nums[j];
        
        // Check if current value is greater than the max Profit
        if (curr > maxProfit) {
          maxProfit = curr;
        }
      }
      curr = 0;
    }
    
    return maxProfit;
  }
  
}
