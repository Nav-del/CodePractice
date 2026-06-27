class Solution {
    public String reverseWords(String s) {
       String[] w = s.split(" ");
        String result = "";
       for(int i=0;i<w.length;i++){
        for(int j=w[i].length() -1; j>=0;j--){
            result +=w[i].charAt(j);
        }
        if(i<w.length-1){
            result +=" ";
        }
       } 
       return result;
    }
}
