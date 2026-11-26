class Solution {
    public void moveZeroes(int[] nums) {
       int index=0;

       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[index]=nums[i];
            index++;
        }
       }

       for(int i=index;i<nums.length;i++){
        nums[i]=0;
       }
    }
}

/*
1. Initialize a write pointer: Create a pointer starting at the very first position (index 0) to keep track of where the next non-zero number should be placed.
2. Start a forward loop: Iterate through the entire array from left to right to examine each number.
3. Move non-zero numbers forward: Whenever you find a number that is not zero, copy it into the position marked by the write pointer.
4. Advance the write pointer: Move the write pointer forward by one position so it is ready for the next non-zero number. (If the current number is zero, simply skip it without moving the write pointer).
5. Fill the remaining spots with zeros: Once all non-zero numbers have been shifted to the front, start a second loop from the write pointer's current position to the end of the array, setting every remaining element to zero.

*/
