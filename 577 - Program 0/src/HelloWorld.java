/*
 * Author: Nolan Smith
 * Email: nosmith@wisc.edu
 * Course: CS577
 */

import static java.lang.System.out;
import java.util.Scanner;

public class HelloWorld {

  public static void main(String[] args) {
    
    //Iteraiton Var and Scanner
    Scanner in = new Scanner(System.in);
    int totalInputs = Integer.parseInt(in.nextLine());
  
    while (totalInputs>0) {
      out.println("Hello, " + in.nextLine() + "!");
      totalInputs--;
    } 
    in.close();
  }
}

