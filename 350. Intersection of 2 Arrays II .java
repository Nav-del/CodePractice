class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer , Integer> m = new HashMap<>();

        for(int n:nums1){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int[] res = new int[nums1.length];
        int k=0;

        for(int n:nums2){
            int count = m.getOrDefault(n,0);
            if(count==0){
                continue;
            }
            else{
                res[k]=n;
                k++;
                m.put(n,count-1);
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}
