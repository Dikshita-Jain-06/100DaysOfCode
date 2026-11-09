/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> preOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root==null) return res;
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            res.add(curr.data);
            if(curr.right!=null){
                st.push(curr.right);
            }
            if(curr.left!=null){
                st.push(curr.left);
            }
        }
        return res;
    }
}