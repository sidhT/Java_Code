import java.math.BigInteger;

public class BigIntegerVariableTypeExample {
    static void extraLongFactorials(int n) {
        // this is the main part where we are uning BigInteger to store
        // greater the capacity of Long. This is where value can be large like
        // factorial of Number
        // https://www.hackerrank.com/challenges/extra-long-factorials/submissions/code/84010698
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
        //selection Sort
        //System.out.println("starting..");
    }
}
