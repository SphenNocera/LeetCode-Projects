class Solution {
    public int lengthOfLongestSubstring(String s) {
        String longest = "";
        
        for(int i = 0; i < s.length(); i++){
            String temp = "";
            for(int j = i; j < s.length(); j++){
                if(temp.indexOf(s.charAt(j)) == -1){
                    temp += s.charAt(j);
                }else{
                    break;
                }
            }
            if(temp.length() > longest.length()){
                longest = temp;
            }
        }
        return longest.length();
    }
}