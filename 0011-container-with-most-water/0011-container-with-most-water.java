class Solution {
    public int maxArea(int[] arr) {
        int maxwater=0;
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int width=j-i;
            int height=Math.min(arr[i],arr[j]);
            int area=width*height;
            maxwater=Math.max(maxwater,area);
             if(arr[i]<arr[j])
        {
            i++;
        }else{
            j--;
        }
        } 
       
        return maxwater;
    }
}