import java.util.Scanner;

public class LeavesVisited {
  
  protected static class Node<T> {
    public int data;
    public Node<T> parent; // null for root node
    public Node<T> leftChild;
    public Node<T> rightChild;
    public boolean isBlack; //isBlack boolean variable
    
    /*
     * Constructor for Node class
     */
    public Node(int data) { 
      this.data = data; 
      isBlack = false;
      }
  }

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int n = Integer.parseInt(in.nextLine());
    String leaves = in.nextLine();
    
    System.out.println(n);
    //System.out.println(leaves);

    in.close();
  }

}
