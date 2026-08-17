class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(!st.isEmpty() && operations[i].equals("C")){
                sum-=st.peek();
                st.pop();
            }
            else if(operations[i].equals("D")){
                int val=2*st.peek();
                sum+=val;
                st.push(val);
            }
            else if(operations[i].equals("+")){
                if(st.size()>=2){
                    int last=st.pop();
                    int second = st.peek();
                    sum+=last+second;
                    st.push(last);
                    st.push(last+second);
                }
            }
            else{
                int x = Integer.valueOf(operations[i]);
                sum+=x;
                st.push(x); 
            }
        }
        return sum;
    }
}
