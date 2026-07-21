class Solution {
    public boolean isCircularSentence(String sentence) {
       String w[]=sentence.split(" ");
       if(w.length==1 && sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
        return true;
       } 
       if(w.length==1 && sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
        return false;
       }

       for(int i=0;i<sentence.length();i++){
        char ch = sentence.charAt(i);

        if(!Character.isLetter(ch) && sentence.charAt(i-1)!=sentence.charAt(i+1) || sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            return false;
        }
       }
       return true;
    }
}
