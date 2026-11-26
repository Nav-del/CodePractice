class Solution {
    public int[] replaceElements(int[] arr) {
       int m =-1;
       for(int i=arr.length-1;i>=0;i--){
        int t = arr[i];
        arr[i]=m;
        m = Math.max(m,t);
       } 
       return arr;
    }
}

/*
1. Initialize a tracker: Create a variable to keep track of the largest number seen so far from the right side, and set its starting value to -1.
2. Start a backward loop: Begin iterating through the array from the very last element and move backward toward the first element.
3. Save the current value: Temporarily store the current element's original value before overwriting it.
4. Replace the current element: Overwrite the current position in the array with the largest number seen so far to its right.
5. Update the maximum tracker: Compare the largest number seen so far with the original value you just saved, and keep whichever one is bigger.
6. Repeat steps 3 through 5 for every remaining element as you move toward the start of the array.
7. Return the result: Once the loop finishes updating the first element, return the modified array.
*/
