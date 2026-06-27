class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int l =0;
        int r=nums.length-1;

        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
