class Solution {
    public boolean validMountainArray(int[] arr) {
       if(arr.length<3){
        return false;
       } 
       int i=0;
       int j=arr.length -1;

       while(i+1 < arr.length && arr[i]<arr[i+1]){
        i++;
       }

       while(j > 0 && arr[j-1] > arr[j]){
        j--;
       }
    if(i>0 && j <arr.length-1){
       if(i==j){
        return true;
       }
    }
    return false;
    }
}

/*
1. Check minimum length: If the array has fewer than 3 elements, immediately return false because a mountain needs at least a start, a peak, and an end.
2. Set two pointers: Place one pointer at the very beginning of the array (left side) and a second pointer at the very end of the array (right side).
3. Climb up from the left: Move the left pointer forward one step at a time as long as the next number is strictly larger than the current number. Stop when the numbers stop increasing.
4. Climb up from the right: Move the right pointer backward one step at a time as long as the previous number is strictly larger than the current number. Stop when the numbers stop increasing from the right.
5. Verify both climbs actually happened: Check that the left pointer moved away from the starting position and the right pointer moved away from the ending position (this ensures the array isn't strictly increasing or strictly decreasing all the way through).
6. Check if both pointers met at the same peak: If both pointers stopped at the exact same index, return true.
7. Return false otherwise: If they stopped at different positions or didn't climb from both ends, return false.
*/
