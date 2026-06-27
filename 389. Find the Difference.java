class Solution {
    public char findTheDifference(String s, String t) {
        int s_sum=0;
        int t_sum=0;

        for(int i=0;i<s.length();i++){
            s_sum+=s.charAt(i);
        }

        for(int i=0;i<t.length();i++){
            t_sum+=t.charAt(i);
        }

        int result = t_sum - s_sum;
        return (char) result;
    }
}
