class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0;i <s.length();i++){
            char c = s.charAt(i);

            if(c=='*'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else{
                stk.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stk.size(); i++) {
            char c = stk.get(i);
            sb.append(c);
        }
        return sb.toString();
    }
}
