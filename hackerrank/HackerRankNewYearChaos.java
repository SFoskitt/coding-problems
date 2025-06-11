import java.util.*;

public class HackerRankNewYearChaos {
  
  public static void main(String[] args) {
    List<Integer> q = Arrays.asList(2, 1, 5, 3, 4);
    System.out.println(q);
    int n = q.size();
    
    int bribes = 0;
    for (Integer i = 1; i <= n; i++) {
        Integer tmp = q.indexOf(i-1);
        System.out.println("tmp " + tmp + " i " + i);
        
        if (tmp > i) {
        // if (tmp.intValue() > i.intValue()) {
          System.out.println("does this happen?");
            if ((tmp - i) > 2) {
                System.out.println("Too Chaotic");
                return;
            }
            bribes += tmp - i;
        }
    }
    
    System.out.println(bribes);    
  }
}
