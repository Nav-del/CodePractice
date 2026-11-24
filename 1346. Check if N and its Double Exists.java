class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> s= new HashSet<>();
        for(int n:arr){
            if(s.contains(2*n) || s.contains(n/2) && n%2==0){
                return true;
            }
            s.add(n);
        }
    return false;
    }

}

/*
Steps
1. Create an empty set to keep track of the numbers you have already seen.
2. Start a loop to look at each number in the array one by one, moving from left to right.
3. Check for a double: Look inside the set to see if twice the current number is already there.
4. Check for a half: If the current number is even, look inside the set to see if half of the current number is already there.
5. Return true early: If either the double or the half is found in the set, stop the loop immediately and return true.
6. Save the current number: If no match was found, add the current number into the set so future numbers can check against it.
7. Repeat steps 3 through 6 for the remaining numbers in the array.
8. Return false: If the loop reaches the end of the array without finding a matching pair, return false.
*/
