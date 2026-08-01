class Solution {
public:
    int maxArea(vector<int>& arr) {
        int maxwater = 0;
        int n = arr.size();
        int st = 0, end = n - 1;

        while (st < end) {
            int width = end - st;
            int height = min(arr[st],arr[end]);

            int area = height * width;

            maxwater = max(maxwater, area);

            if (arr[st] < arr[end])
                st++;
            else
                end--;
        }
        return maxwater ;
    }
};