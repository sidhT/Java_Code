import java.util.Arrays;

public class TwoSumProblem {
    //problem link -https://leetcode.com/problems/two-sum/description/
    public static void main(String[] args) {
        System.out.println("starting..");
        int ex[] = {2, 4, 1, 6, 8, 2};
        int target = 7;
        boolean done = false;
        //Arrays.sort(ex);
        for (int i = 0; i < ex.length - 1; i++) {
            for (int j = i + 1; j < ex.length; j++) {
                //System.out.println(ex[i]);
                if (ex[i] + ex[j] == target) {
                    System.out.print("solution is " + i + " & " + j);
                    done = true;
                    i = ex.length;
                    break;
                }
            }
        }
        if (!done) {
            System.out.print("No solution found");
        }
    }
}
