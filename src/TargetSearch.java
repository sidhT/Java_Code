/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

pssume that each input would have exactly one solution, and you may not use the same element twice.
*/

import java.util.Arrays;
class TargetSearch {
    public static void main(String[] args){
        //System.out.println("This is a test");
        int [] arr = {8,7,5,2,1,4,2,1};
        int target = 3;
        int i;

        Arrays.sort(arr);

        disp(arr);

        int l = arr.length;

        int [] bitmap = new int[arr[l-1]+1];

        for (i=0;i<l;i++)
            bitmap[arr[i]] = 1;


        for (i=0; i<l;i++)
            try {
                if (bitmap[target - arr[i]] == 1)
                    System.out.println("Matching numbers are " + arr[i] + " " + (target - arr[i]));
                    break;
            }
            catch (Exception e){

            }

    }

    public static void disp(int [] arr){
        for (int i=0; i<arr.length;i++)
            System.out.print(arr[i]+", ");
    }

    //below is the brute force method with complexity O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((i != j) && ((nums[i]+nums[j]) == target)){
                    int [] r = {i,j};
                    return (r);
                    //break;
                }
            }
        }
        int [] r = {0,0};
        return (r);
    }
}
