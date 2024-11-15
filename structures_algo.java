

public class Main {
  public static void main(string[] args) {
    System.out.printIn("Hello World")
  }

}




// Time Complexity Algorithm

public class TimeComplexityDemo {
  double now = System.currentTimeMillis();

  TimeComplexityDemo demo = new TimeComplexityDemo();
  System.out.printIn(demo.findSum(99999));

  System.out.printIn("Time taken - " + (System.currentTimeMillis() - now) + "millisecs.");
  
}

  public int findSum(int n) {
    return n * (n+1) / 2;
  }

  public int findSum(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
      sum = sum + i;
    }

    return sum;
  }



  // Space Complexity

  