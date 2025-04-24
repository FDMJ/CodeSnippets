package examplesCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class LottoZahlenSet {
  public static void main(String[] args) {
    var rnd = new Random();
    var lotto = new HashSet<Integer>();
    
    while (lotto.size() < 6) {
      lotto.add(rnd.nextInt(49) + 1);
    }
    System.out.println(lotto);
  
    var ordered = new ArrayList(lotto);
    Collections.sort(ordered);
    System.out.println(ordered);
  }
}
