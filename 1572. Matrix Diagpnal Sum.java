class Solution {
    public int diagonalSum(int[][] mat) {
       int l=mat.length;
       int s=0;

       for(int i=0;i<l;i++){
        s+=mat[i][i];
        s+=mat[l-1-i][i];
       }

       if(l%2 != 0){
        s-=mat[l/2][l/2];
       }
       return s;
    }
}
