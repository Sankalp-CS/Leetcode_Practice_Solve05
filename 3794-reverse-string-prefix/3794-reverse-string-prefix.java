class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(s.charAt(i));
        }
        String s1=sb.reverse().toString();
        return s1+s.substring(k);
    }
}