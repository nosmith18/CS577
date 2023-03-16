import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.NoSuchElementException;


public class Nuts_And_Bolts<T> implements GraphADT<T>{

  /**
   * Vertex objects group a data field with an adjacency list of weighted
   * directed edges that lead away from them.
   */
  protected class Vertex {
      public T data; // vertex label or application specific data
      public LinkedList<Edge> edgesLeaving;

      public Vertex(T data) {
          this.data = data;
          this.edgesLeaving = new LinkedList<>();
      }
  }
  
  /**
   * Edge objects are stored within their source vertex, and group together
   * their target destination vertex, along with an integer weight.
   */
  protected class Edge {
      public Vertex target;
      public int weight;

      public Edge(Vertex target, int weight) {
          this.target = target;
          this.weight = weight;
      }
  }
  
  protected Hashtable<T, Vertex> vertices; // holds graph verticies, key=data
  public Nuts_And_Bolts() { vertices = new Hashtable<>(); }
  
  public static void main(String[] args) {
    
  

  }

  @Override
  public boolean insertVertex(T data) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removeVertex(T data) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean insertEdge(T source, T target, int weight) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removeEdge(T source, T target) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean containsVertex(T data) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean containsEdge(T source, T target) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int getWeight(T source, T target) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public List<T> shortestPath(T start, T end) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getPathCost(T start, T end) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int getEdgeCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getVertexCount() {
    // TODO Auto-generated method stub
    return 0;
  }

}
