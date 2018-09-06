/*
Question : Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Algorithm:

In this approach, we make use of two counters left and right.
First, we start traversing the string from the left towards the right and for every \text{‘(’}‘(’ encountered, we increment the left counter and for every \text{‘)’}‘)’ encountered, we increment the right counter.
Whenever left becomes equal to right, we calculate the length of the current valid string and keep track of maximum length substring found so far.
If right becomes greater than left we reset left and right to 0.

*/
public class LongestValidParentheses {
    public static void main (String [] args){
        String para = "(()))())(";
        int l = para.length();
        int left = 0, right =0, matchlen=0;

        //parsing from left to right
        for (int i=0; i < l;i++){
            if (para.charAt(i)=='(') {
                left++;
            }
            else {
                right++;
            }
            if (left==right){
                matchlen = Math.max(matchlen,right*2);
            }
            else if (right>=left){
                left = 0;
                right = 0;
            }
        }

        //parsing from right to left
        left = right = 0;

        for (int i=l-1; i >= 0;i--){
            if (para.charAt(i)==')') {
                right++;
            }
            else {
                left++;
            }
            if (right==left){
                matchlen = Math.max(matchlen,right*2);
            }
            else if (left>=right){
                left = 0;
                right = 0;
            }
        }

        System.out.println(matchlen);
    }
}
