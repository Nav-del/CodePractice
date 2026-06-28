class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;

        Set<Character> set = new HashSet<>();

        for(int i=0;i<jewels.length();i++){
            char ch = jewels.charAt(i);
            set.add(ch);
        }

        for(int i=0;i<stones.length();i++){
            char ch= stones.charAt(i);
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
