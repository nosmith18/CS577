import java.util.Scanner;
import java.lang.Math;

public class CurrencyExchange {
  
  private static int maxTrades;
  
  private static double findMax(Exchange[] exchanges, double numTrades, String start, String end, double currRate) {
    
    while (numTrades < maxTrades) {
      for (int i = 0; i < exchanges.length; i++) {
        if (exchanges[i].getStart().compareTo(end) == 0) {
          numTrades++;
          if (exchanges[i].getEnd().compareTo(start) == 0) {
            currRate = currRate * exchanges[i].getRate()/100;
            return Math.ceil(100*(1-Math.pow(1/currRate, 1/numTrades)));
          } else {
            return findMax(exchanges, numTrades, start, exchanges[i].getEnd(), currRate);
          }
        }
      }
      return -1;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Get n number of coins
    String[] first = in.nextLine().split(" ");
    int numExchanges = Integer.parseInt(first[0]);
    maxTrades = Integer.parseInt(first[1]);
    
    Exchange[] exchanges = new Exchange[maxTrades];
    
    // Save and add to total
    for (int i = 0; i < maxTrades; i++) {
      String[] line = in.nextLine().split(" ");
      exchanges[i] = new Exchange(line[0], line[1], Integer.parseInt(line[2]));
    }
    
    double[] rates = new double[maxTrades];
    
    for (int i = 0; i < maxTrades; i++) {
      Exchange curr = exchanges[i];
      String start = curr.getStart();
      String end = curr.getEnd();
      double currRate = curr.getRate()/(double)100;
      rates[i] = findMax(exchanges, 1, start, end, currRate);
    }
    
    //Get max rate
    int max = -1;
    for (int i = 0; i < rates.length; i++) {
      if (rates[i] > max) max = (int) rates[i];
    }
    
    System.out.println(max);
    
    in.close();
    
  }

}
