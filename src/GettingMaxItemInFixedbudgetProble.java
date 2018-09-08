import java.util.Arrays;

//Hackerrank problem
//https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
public class GettingMaxItemInFixedbudgetProble {
        static int maximumToys(int[] prices, int k) {
            Arrays.sort(prices);
            int sum=0;
            for(int i=0;i<prices.length;i++){
                sum=sum+prices[i];
                if(sum>k)
                    return i;
                else if(sum==k)
                    return i;
            }
            return prices.length;
        }

        public static void main(String[] args) {
            int[] s= new int[]{1,2,3,5,1,2,1};
            int[] outp=new int[]{1};
            int res=maximumToys(s,4);
            System.out.println("Total Parenthesial String.."+res);
        }
    }

