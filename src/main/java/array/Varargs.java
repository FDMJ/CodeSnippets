package array;

public class Varargs {
  public static void main(String[] args) {
//    System.out.printf("%s %d %n", "Hello", 12);
//    System.out.printf("%s %d %n", "Hello", 12, 12);
    
    printInts(1, 2);
    printInts(1, 2, 3, 4);
    printInts();
    
    int[] numbers = {1, 2, 3, 4, 5};
    printInts(numbers);
  }
  
  static void printInts(int... numbers) {
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
