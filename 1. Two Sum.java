class Solution {
    public int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<a.length;i++){
            int comp = target-a[i];
            if( map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            else{
                map.put(a[i],i);
            }
        }
        throw new IllegalArgumentException("No Match");
    }
}
