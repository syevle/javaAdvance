package javaPractice.java8.parallel_programming_with_java8_streams.common;

public class StockInfo {
  public final String ticker;
  public final double price;
  
  public StockInfo(final String symbol, final double thePrice) {
    ticker = symbol;
    price = thePrice;
  }
  
  public String toString() {
    return String.format("ticker: %s price: %g", ticker, price);
  }
}