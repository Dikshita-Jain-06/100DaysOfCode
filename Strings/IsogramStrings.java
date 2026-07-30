

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:data.toCharArray()){
            if(map.containsKey(ch)) return false;
            else{
                map.put(ch,1);
            }
        }
        return true;    }
}