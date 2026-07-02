class Solution {
    public int findNumbers(int[] nums) {
       if(nums.length==0){
        return 0;
       } 
       int count = 0;

       for(int i=0; i<nums.length;i++){
        int d = 0;

        while(nums[i]!=0){
            nums[i]=nums[i]/10;
            d++;
        }
        if(d % 2 ==0){
            count++;
        }
       }
       return count;
    }
}
