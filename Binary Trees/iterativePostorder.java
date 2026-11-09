/* Binary Tree Node Structure
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        if(root==null) return res;
        st1.push(root);
        while(!st1.isEmpty()){
            Node curr = st1.pop();
            st2.add(curr);
            if(curr.left!=null) st1.add(curr.left);
            if(curr.right!=null) st1.add(curr.right);
        }
        while(!st2.isEmpty()){
            res.add(st2.pop().data);
        }
        return res;
    }
}