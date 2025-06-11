import java.io.IOError;

public class HackerRankCountingValleys {
  public static void main(String[] args) throws IOError {
    countingValleys();
  }

  private static void countingValleys() {
    int sl = 0;
    int val = 0;
    String path = "UDDDUDUU";

    String[] pathSteps = path.split("");
    
    for(String step : pathSteps) {
        System.out.println("step " + step); 

        if(step.equals("U")){
          sl--;
          System.out.println("step is U");
        } else {
          sl++;
          System.out.println("step is D");
        }
        if(step.equals("U") && sl == 0){
            val++;
        }
        System.out.println("sl " + sl + " val " + val);
    }
    System.out.println("Final val = " + val); 
  }
}