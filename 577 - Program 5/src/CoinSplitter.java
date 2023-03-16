import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CoinSplitter {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Get n number of coins
    int n = Integer.parseInt(in.nextLine());
    
    PriorityQueue<Integer> coins = new PriorityQueue<Integer>(Collections.reverseOrder());
    int totalVal = 0;
    int currCoin = 0;
    int expVal = 0;
    
    // Save and add to total
    for (int i = 0; i < n; i++) {
      currCoin = in.nextInt();
      totalVal += currCoin;
      coins.add(currCoin);
    }
    
    expVal = totalVal/2;
    
    if (totalVal%2 != 0) {
      System.out.println("F");
      in.close();
    } else {
    
    // Call helper function
    split(coins, expVal);
    in.close();
    }
  }

  private static void split(PriorityQueue<Integer> coins, int expVal) {
    int stack1 = 0;
    int stack2 = 0;
    
    while (!coins.isEmpty()) {
      // int currCoin = coins.peek();
      if (stack1 == stack2) {
        stack1 += coins.poll();
      } else if (stack1 < stack2) {
        stack1 += coins.poll();
      } else {
        stack2 += coins.poll();
      }
      
      // Check for too big of values
      if (stack1 > expVal || stack2 > expVal) {
        System.out.println("F");
        return;
      }
    }
    System.out.println("T");
  }

}
