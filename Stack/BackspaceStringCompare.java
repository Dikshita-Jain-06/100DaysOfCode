class Solution {
    public boolean backspaceCompare(String s, String t) {
        //METHOD 1 STRINGBUILDER 
        // StringBuilder sb = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(sb.length()>0 && ch=='#'){
        //         sb.deleteCharAt(sb.length()-1);
        //     }
        //     else if(ch!='#'){
        //         sb.append(ch);
        //     }
        // }
        // for(int i=0;i<t.length();i++){
        //     char ch = t.charAt(i);
        //     if(sb2.length()>0 && ch=='#'){
        //         sb2.deleteCharAt(sb2.length()-1);
        //     }
        //     else if(ch!='#'){
        //         sb2.append(ch);
        //     }
        // }
        // if(sb.toString().equals(sb2.toString())) return true;
        // return false;


        //METHOD 2 STACK
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch=='#'){
                st.pop();
            }
            else if(ch!='#'){
                st.push(ch);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!st2.isEmpty() && ch=='#'){
                st2.pop();
            }
            else if(ch!='#'){
                st2.push(ch);
            }
        }
        if(st.equals(st2)) return true;
        return false;
    }
}
