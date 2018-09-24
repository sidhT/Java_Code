public class CoinChange {
    public static void main(String args[])
    {
        //int coins[] =  {9, 6, 5, 1};
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int size = coins.length;
        int change = 11;
        //System.out.println("Minimum coins required is "+ minCoinsRecursion(coins, size, change) );
        System.out.println("Minimum coins required is "+ minCoinsIteration(coins, size, change) );
    }

    static int minCoinsRecursion(int coins[], int size, int change){
        if (change == 0)
            return 0;

        int res = Integer.MAX_VALUE;

        for (int i=0; i < size;i++){
            if(coins[i] <= change){
                int sub_result = minCoinsRecursion(coins, size, change-coins[i]);
                if( sub_result != Integer.MAX_VALUE && sub_result+1 < res)
                    res = sub_result + 1;
            }
        }
        return res;
    }


    static int minCoinsIteration(int coins[], int size, int change){
        int ans [] = new int [size];

        int i = size - 1;

        i = size - 1;
        int cnt = 0;
        while (i>=0){
            while (change >= coins[i]){
                change = change - coins[i];
                ans[cnt] = coins[i];
                cnt++;
            }
            i = i - 1;
        }

        return cnt;
    }

}
