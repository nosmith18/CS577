import java.util.*;

public class City {

  private int thisCity; // This City's number
  private int goalCity; // Goal City's number
  private LinkedList<Integer> adjacent; // Adjacency List for this city
  
  City(int thisCity, int goalCity){
    this.thisCity = thisCity;
    this.goalCity = goalCity;
    adjacent = new LinkedList<Integer>();
  }
  
  public void addEdge(int endpoint) {
    adjacent.add(endpoint);
  }
  
}
