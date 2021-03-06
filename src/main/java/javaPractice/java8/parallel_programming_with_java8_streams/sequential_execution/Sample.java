package javaPractice.java8.parallel_programming_with_java8_streams.sequential_execution;

import java.util.Arrays;
import java.util.List;

class Sample {   
  public static int doubleIt(int number) {
    System.out.println("doubleIt called in thread " + Thread.currentThread());
    return number * 2;
  }                                     
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                   
    System.out.println(
      numbers.stream()
             .mapToInt(Sample::doubleIt)
             .sum());
  }              
}










