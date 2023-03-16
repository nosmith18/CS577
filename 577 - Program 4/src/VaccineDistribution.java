import java.util.*;
import java.util.PriorityQueue;

public class VaccineDistribution {
  
  public static int calcLargest(boolean[] points, Edge[] edges, int clusters) {
    
    int smallestEdgeWeight = 1001;
    Edge smallest = null;
    for (int i = 0; i < edges.length; i++) {
      if (edges[i].getWeight() < smallestEdgeWeight) {
        smallest = edges[i];
        smallestEdgeWeight = smallest.getWeight();
        edges[i] = null;
      }
    }
    
    PriorityQueue<Integer> usedWeights = new PriorityQueue<Integer>();
    PriorityQueue<Edge> kruskal = new PriorityQueue<Edge>();
    kruskal.add(smallest);
    int numEdges = points.length - clusters;
    Edge curr = null;
    
    while (kruskal.size() != 0) {  // Add edge
      curr = kruskal.poll(); 
      
      // Get two edges
      int p1 = curr.getVertex1() - 1;  
      int p2 = curr.getVertex2() - 1;
      
      // If either point isn't connected yet
      if (points[p1] == false || points[p2] == false) {
        
        // Add weight to usedWeights
        usedWeights.add(curr.getWeight());
        
        // Check other edges for connections
        for (int i = 0; i < edges.length; i++) {
          if (edges[i] != null) {
            int v1 = edges[i].getVertex1() - 1;
            int v2 = edges[i].getVertex2() - 1;
            if ((points[p1] == false && v1 == p1) || (points[p1] == false && v2 == p1)) {
              kruskal.add(edges[i]);
            } else if (points[p2] == false && v1 == p2 || points[p2] == false && v2 == p2) {
              kruskal.add(edges[i]);
            }
          }
        }
        points[p1] = true;
        points[p2] = true;
      }
    }
    
    int ret = -1;
    for (int i = numEdges; i > 0; i--) {
      ret = usedWeights.poll();
    }
    return ret;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] inp = in.nextLine().split(" ");
    int n = Integer.parseInt(inp[0]);
    int k = Integer.parseInt(inp[1]);
    int m = Integer.parseInt(inp[2]);
    
    boolean[] points = new boolean[n];
    Edge[] edges = new Edge[m];
    Edge[][] clusters = new Edge[k][];
    
    for (int i = 0; i < m; i++) {
      inp = in.nextLine().split(" ");
      edges[i] = new Edge(Integer.parseInt(inp[0]), Integer.parseInt(inp[1]),
           Integer.parseInt(inp[2]));
    }
    
    int x = calcLargest(points, edges,  k);
    System.out.println(x);
    
    in.close();
  }
}
