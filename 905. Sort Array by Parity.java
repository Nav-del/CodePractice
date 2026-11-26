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
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0,
            j = nums.length - 1;

        while (i < j) {
            int mod1 = nums[i] % 2,
                mod2 = nums[j] % 2;

            if (mod1 == 1 && mod2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (mod1 == 0) {
                i++;
            }

            if (mod2 == 1) {
                j--;
            }
        }

        return nums;
    }
}
/*
1. Set two pointers: Place a left pointer at the very beginning of the array (index 0) and a right pointer at the very end of the array.
2. Loop while pointers haven't met: Keep repeating the process as long as the left pointer is strictly to the left of the right pointer.
3. Check parity at both pointers: Check whether the number at the left pointer is even or odd, and whether the number at the right pointer is even or odd.
4. Swap mismatched numbers: If the left number is odd and the right number is even, swap their positions so the even number moves to the front and the odd number moves to the back. (Note: On the next loop iteration, both pointers will naturally move inward since they are now in their valid spots).
5. Advance the left pointer: If the number at the left pointer was already even, move the left pointer forward by one step.
6. Move the right pointer backward: If the number at the right pointer was already odd, move the right pointer backward by one step.
7. Return the result: Once the left and right pointers meet, all even numbers are on the left and all odd numbers are on the right, so return the modified array.

*/
