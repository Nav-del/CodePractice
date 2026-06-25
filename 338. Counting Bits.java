class Solution {
    public int[] countBits(int n) {
        int ans[]= new int[n+1];
        ans[0]=0;

        for(int i =1; i<=n; i++){
            String B = Integer.toBinaryString(i);
            int oC = cO(B);
            ans[i]=oC;
        }
        return ans;
    }

    private int cO(String c){
        int count = 0;
        for(int i=0;i<c.length();i++){
            if(c.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
