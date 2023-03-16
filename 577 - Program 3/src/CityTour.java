import java.util.*;


/*
 * Author: Nolan Smith
 * Email: nosmith@wisc.edu
 * Course: CS577
 */

public class CityTour {

  public static void main(String[] args) {
    //Scanner
    Scanner in = new Scanner(System.in);
    String[] input = in.nextLine().split(" ");
    int cities = Integer.parseInt(input[0]);
    int edges = Integer.parseInt(input[1]);
    City[] cityList = new City[cities];
    
    // Add all City objects
    for (int i=0; i<cities; i++) {
      cityList[i] = new City(i+1, cities);
    }
    
    // Add all edges between cities
    for (int i=0; i<edges; i++) {
      input = in.nextLine().split(" ");
      cityList[Integer.parseInt(input[0])-1].addEdge(Integer.parseInt(input[1]));
      cityList[Integer.parseInt(input[1])-1].addEdge(Integer.parseInt(input[0]));
    }
    
    System.out.println(DFS(cities, edges, cityList));
  }
  
  public static int DFS(int cities, int edges, City[] cityList) {
    int days = 0;
    Boolean[] visited = new Boolean[cities];
    
    // Make the queue
    LinkedList<City> queue = new LinkedList<City>();
    
    // Iterate through cities
    queue.add(cityList[0]);
    while (queue.size() != 0) {
      City curr = queue.poll();
      // I'm lost
    }   
    // Check city number
    
    return -1;
  }

}
