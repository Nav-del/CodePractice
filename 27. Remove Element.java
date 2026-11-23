/*
Brute Force
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!= val){
                nums[i]= nums[j];
                i++;
            }
        }
        return i;    
    }
}*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;

        while(i<n){
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;

    }
}

/*

1. Set Up Pointers

    • n = nums.length: Tracks the current length of the valid portion of the array (also acts as the boundary for the end).
    • i = 0: Acts as the scanner pointer moving from left to right to check each element.

2. Loop Until the Scanner Meets the End Boundary

    • while (i < n): Continues checking elements as long as i hasn't crossed into the discarded zone at the end of the array.

3. Check and Swap Matches

    • if (nums[i] == val): If the current element matches the target value to remove:
    	• nums[i] = nums[n - 1]: Overwrite the current element with the last valid element in the array.
    	• n--: Shrink the valid array size by 1 (effectively discarding that last slot).
    	• Note: i does not increment here because the newly swapped-in element at nums[i] hasn't been checked yet—it might also be equal to val.

4. Advance When Safe

      • else { i++; }: If nums[i] is not val, keep it in place and move i forward to check the next element.

5. Return New Length

    • return n: Once i reaches n, all elements before index n are guaranteed not to be val, so n is returned as the new length.

*/
