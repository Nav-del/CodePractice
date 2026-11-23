//Brute Force Code
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = nums1.length-1;

        while(p3>=0){
            int e1,e2;
            e1=(p1>=0)?nums1[p1]:Integer.MIN_VALUE;
            e2=(p2>=0)?nums2[p2]:Integer.MIN_VALUE;

        if(e1>e2){
            nums1[p3]=e1;
            p3--;
            p1--;
        }
        else{
            nums1[p3]=e2;
            p3--;
            p2--;
        }
        }
    }
}

/*
Working
1. Set Up Three Pointers
  • p1 = m - 1: Points to the last valid element in nums1.
  • p2 = n - 1: Points to the last element in nums2.
  • p3 = nums1.length - 1: Points to the very last empty slot at the end of nums1 (where the largest merged element will go).

2. Loop Backwards Through nums1
  • while (p3 >= 0): The loop runs until every slot in nums1 is filled from right to left.

3. Safely Fetch Current Values
  • e1 and e2: The code grabs the current numbers at p1 and p2.
  • Out-of-bounds fallback (Integer.MIN_VALUE): If one array runs out of elements (p1 < 0 or p2 < 0), its value defaults to the smallest possible integer. This guarantees the remaining elements from the other array will always win the comparison.

4. Compare and Place the Larger Element
  • if (e1 > e2): If nums1's current element is larger, place e1 at nums1[p3], then move p1 and p3 one step to the left (p1--, p3--).
  • else: Otherwise, place e2 at nums1[p3], then move p2 and p3 one step to the left (p2--, p3--).
*/
