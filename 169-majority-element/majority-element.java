class Solution {
    public int majorityElement(int[] nums) {
       int ele = nums[0];
       int freq = 1;
       int ans = 0;
       for(int i=1; i<nums.length; i++) {
        if(freq==0) {
            ele = nums[i];
            freq = 1;

        }
        else if(nums[i] == ele) freq++;
        else freq--;
       }
       return ele;
    }
}