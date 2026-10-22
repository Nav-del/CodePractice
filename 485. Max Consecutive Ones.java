class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int m=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                m=Math.max(count,m);
                count=0;
            }
        }
        return Math.max(m,count);
    }
}
