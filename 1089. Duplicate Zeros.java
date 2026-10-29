class Solution {
    public void duplicateZeros(int[] arr) {
        int pZd = 0;              // Track the count of duplicate zeros that will fit in the array
        int lI = arr.length - 1;  // Right boundary of the valid elements after duplication

        // Pass 1: Find the number of zeros to duplicate and locate the last valid source element
        for (int i = 0; i <= lI - pZd; i++) {
            if (arr[i] == 0) {
                // Edge case: If a zero occurs right at the boundary of our shifting space,
                // it cannot be duplicated because the second zero would fall out of bounds.
                if (i == lI - pZd) {
                    arr[lI] = 0;   // Place the single zero at the very end of the array
                    lI -= 1;       // Shrink the boundary to shift remaining elements
                    break;
                }
                pZd++; // Increment the duplicate zero count
            }
        }

        // Pass 2: Write elements from right to left using two pointers
        int nLI = lI - pZd; // The index of the last element that needs to be copied/shifted
        for (int i = nLI; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + pZd] = 0; // Copy the original zero to its shifted position
                pZd--;            // Decrement the shift offset for the duplicate
                arr[i + pZd] = 0; // Insert the duplicated zero right before it
            } else {
                arr[i + pZd] = arr[i]; // Shift the non-zero element to its new position
            }
        }
    }
}
