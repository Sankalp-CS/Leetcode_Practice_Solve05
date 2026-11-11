class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] freq=new int[26];
        for(int t:tasks){
            freq[t-'A']++;
        }
        int maxfreq=0;
        for(int f:freq){
            maxfreq=Math.max(f,maxfreq);
        }
        int countmaxfreq=0;
        for(int c:freq){
            if(c==maxfreq){
                countmaxfreq++;
            }
        }
        return Math.max(tasks.length,(maxfreq-1)*(n+1)+countmaxfreq);
    }
}