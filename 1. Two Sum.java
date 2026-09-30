class Solution {
    public int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> harshit = new HashMap<>();

        for(int i=0;i<a.length;i++){
            int y= target - a[i];

            if(harshit.containsKey(y)){
                return new int[]{harshit.get(y),i};
            }
            else{
                harshit.put(a[i],i);
            }
        }
        throw new IllegalArgumentException("No Match");
    }
}
