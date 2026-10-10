class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int m=(n-1)/2;
        int left=0;
        int right=n-1;
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            if(Math.abs(arr[left]-arr[m])>Math.abs(arr[right]-arr[m])){
                result[i]=arr[left++];
            }else{
                result[i]=arr[right--];
            }
        }
        return result;
    }
}