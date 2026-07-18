class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int big = nums[nums.length-1];
        int num = small;
        while(num>0){
            if(small%num==0 && big%num==0){
                return num;
            }
            num--;
        }
        return 1;
    }
}