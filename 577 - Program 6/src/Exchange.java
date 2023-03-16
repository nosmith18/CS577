
public class Exchange {
  private String start;
  private String end;
  private int rate;
  
  public Exchange(String start, String end, int rate) {
    this.start = start;
    this.end = end;
    this.rate = rate;
  }
  
  public int getRate() {
    return rate;
  }
  
  public String getStart() {
    return start;
  }
  
  public String getEnd() {
    return end;
  }
  
}
