class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
       int i;
       String reversed = "";
       int n = words.length;
       for(i = n-1; i>=0;i--){
      reversed = reversed + words[i]+ " ";
       }
       return reversed.trim();
    }
}