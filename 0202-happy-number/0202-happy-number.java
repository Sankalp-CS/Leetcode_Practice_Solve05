class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> seen=new HashSet<>();
        while(n!=1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n=sum(n);
        }
        return true;
    }

    public int sum(int n) {
        int sum1 = 0;
        while (n > 0) {
            int digit = n % 10;
            sum1 += digit * digit;
            n = n / 10;
        }

        return sum1;
    }
}