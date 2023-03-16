
public class Edge implements Comparable<Edge>{

    private int vertex1;
    private int vertex2;
    private int weight;
    
    Edge (int v1, int v2, int weight2) {
      vertex1 = v1;
      vertex2 = v2;
      weight = weight2;
    }
    
    public int getWeight() {
      return weight;
    }
    
    public int getVertex1() {
      return vertex1;
    }
    
    public int getVertex2() {
      return vertex2;
    }

    @Override
    public int compareTo(Edge other) {
      if (this.weight > other.weight) {
        return 1;
      } else if (this.weight < other.weight) {
        return -1;
      } else {
        int smaller = this.vertex1;
        int bigger = this.vertex2;
        int smallerOther = other.vertex1;
        int biggerOther = other.vertex2;
        
        // Get smallest and biggest
        if (smaller > bigger) {
          smaller = this.vertex2;
          bigger = this.vertex1;
        }
        //Get smallest and biggest
        if (smallerOther > biggerOther) {
          smallerOther = other.vertex2;
          biggerOther = other.vertex1;
        }
        if (smaller < smallerOther) {
          return 1;
        }
        if (smallerOther > smaller) {
          return -1;
        }
        if (bigger < biggerOther) {
          return 1;
        } else {
          return -1;
        }
      }
    }
}
