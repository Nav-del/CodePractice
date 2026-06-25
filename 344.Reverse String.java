class Solution {
    public void reverseString(char[] s) {
        int f = 0;
        int e = s.length-1;

        while(f<e){
            char c = s[f];
            s[f]=s[e];
            s[e] = c;
            f++;
            e--;
        }
    }
}
