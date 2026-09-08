class Solution {
    // private boolean isPrefixAndSuffix(String i,String j){
    //     if(j.startsWith(i) && j.endsWith(i)){
    //         return true;
    //     }
    //     return false;
    // }
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                if(  words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                    count++;
                }
            }
        }
        return count;
    }
}