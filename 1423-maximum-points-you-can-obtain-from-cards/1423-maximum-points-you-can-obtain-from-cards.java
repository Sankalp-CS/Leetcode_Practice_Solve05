    class Solution {
        public int maxScore(int[] card, int k) {
            int tot=0;
            int n=card.length;
            for(int i=0;i<card.length;i++){
                tot+=card[i];
            }
            if(n==k){
                return tot;
            }
            int sum=0;
            int window=n-k;
            for(int i=0;i<n-k;i++){
                sum+=card[i];
            }
            int max=sum;
            int minSum=sum;
            for(int i=window;i<n;i++){
                minSum+=card[i]-card[i-window];
                max=Math.min(minSum,max);
            }
            return tot-max;
        }
    }