package examplesCollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
  public static void main(String[] args) {
    var set = new HashSet<String>();
    set.add("abc");
    set.add("def");
    set.add("ghi");
//    set.add("abc"); // wird ignoriert
    for (var e : set) {
      System.out.println(e);
    }
    
    var lst = Arrays.asList(1, 2, 3);
    var set2 = new HashSet(lst);
    var lst2 = new ArrayList(set2);
  }
}
