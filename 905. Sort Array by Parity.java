//Approach 1
class Solution {
    public int[] sortArrayByParity(int[] nums) {

        Integer[] res = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }

        Arrays.sort(res, (val1, val2) -> Integer.compare(val1 % 2, val2 % 2));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
        return nums;
    }
}

/*
1. Create a wrapper array: Create a new array of Integer objects with the same length as the input array (since custom sorting in Java requires object types rather than primitive integers).
2. Copy the elements: Loop through the original array and copy every number into the new wrapper array.
3. Sort by remainder: Sort the wrapper array by comparing each number's remainder when divided by 2. Numbers with a remainder of 0 (even) are placed before numbers with a remainder of 1 (odd).
4. Copy back to the original array: Loop through the sorted wrapper array and overwrite the original array with the rearranged numbers.
5. Return the result: Return the modified original array.

*/

//Approach 2
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[idx] = nums[i];
                idx++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                res[idx] = nums[i];
                idx++;
            }
        }

        return res;
    }
}
/*
1. Create a result array: Make a new empty array of the exact same size as the input array.
2. Initialize a write pointer: Set a pointer to index 0 to keep track of the next open spot in the new array.
3. First pass (collect even numbers): Loop through the input array from start to finish. Whenever you see an even number, place it into the result array at the write pointer's position and move the pointer forward by one.
4. Second pass (collect odd numbers): Loop through the input array again from start to finish. Whenever you see an odd number, place it into the result array at the write pointer's current position (right after the even numbers) and move the pointer forward by one.
5. Return the result: Return the newly filled result array.
*/

//Approach 3
