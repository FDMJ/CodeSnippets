package examplesCollectionFramework;

import java.util.HashMap;

public class HashMapTest {
  public static void main(String[] args) {
//    var colors = new HashMap<String, Long>();
//    colors.put("green", (long) 0xff);
//    colors.put("red", (long) 0xff0000);
//    colors.put("blue", (long) 0xff00);
//    colors.put("white", (long) 0xffffff);
//    colors.put("black", (long) 0x0);
//    System.out.println(colors.get("blue"));
//
//    for (var name : colors.keySet()) {
//      var code = colors.get(name);
//      System.out.printf("Farbe: %-8s Hexcode: %06x\n", name, code);
//    }
//
//    for (var entry : colors.entrySet()) {
//      System.out.print("Farbe: " + entry.getKey() + ", \t ");
//      System.out.println("Farbcode: " + entry.getValue());
//    }
    
    var dict = new HashMap<String, String>();
    dict.put("one", "eins");
    dict.put("two", "zwei");
    dict.put("three", "drei");
    dict.put("four", "vier");
    System.out.println(dict.get("three"));
  }
}
