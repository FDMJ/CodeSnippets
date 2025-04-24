package examplesCollectionFramework;

import java.util.ArrayList;

public class ArrayListTest {
  public static void main(String[] args) {
    var words = new ArrayList<String>();
    words.add("Java");
    words.add("ist");
    words.add("Spitze!");
    System.out.println(words);
    
    
    var polygon = new ArrayList<Point>();
    polygon.add(new Point(2.2, 1.4));
    polygon.add(new Point(4.8, 3.9));
    polygon.add(new Point(3.0, 2.6));
    System.out.println(polygon);
    
    
    var s = words.get(1);
    var p = polygon.get(0);
//    System.out.println(s);
//    System.out.println(p);
    
    var numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(27);
    numbers.add(12);
    
    System.out.println(numbers);
    
    numbers.add(27);
    numbers.add(27);
//    numbers.clear();
    System.out.println(numbers);
  
    numbers.remove((Integer)27);
    System.out.println(numbers);
    System.out.println(numbers.get(0).getClass());
  }
  record Point(double x, double y) {}
}
