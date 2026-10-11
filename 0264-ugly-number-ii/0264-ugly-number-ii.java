class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        HashSet<Long> set=new HashSet<>();
        pq.offer(1L);
        set.add(1L);
        long curr=1;
        for(int i=0;i<n;i++){
            curr=pq.poll();
            for(int factor:new int[]{2,3,5}){
                long next=factor*curr;
                if(set.add(next)){
                    pq.offer(next);
                }
            }
        }
        return (int)curr;
    }
}