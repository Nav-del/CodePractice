class Solution {
    public String restoreString(String s, int[] indices) {
        if(s==null || s.length()==0){
            return "";
        }
        if(s.length()!=indices.length){
            return "";
        }

        char c[]= new char[s.length()];

        for(int i=0;i<indices.length;i++){
            int p=indices[i];
            c[p]=s.charAt(i);
        }
        String result ="";

        for(int i=0;i<c.length;i++){
            result+=c[i];
        }
        return result;
    }
}
