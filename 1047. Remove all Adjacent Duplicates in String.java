class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(stk.isEmpty()){
                stk.push(ch);
            }

            else if(stk.peek()==ch){
                stk.pop();
            }

            else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
