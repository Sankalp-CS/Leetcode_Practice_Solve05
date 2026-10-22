class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        
        int[] ch=new int[26];
        for(char c:magazine.toCharArray()){
            ch[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            ch[c-'a']--;
            if(ch[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}