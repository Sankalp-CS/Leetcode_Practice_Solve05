class Solution {
    public int clumsy(int n) {
         Stack<Integer> stack = new Stack<>();
        stack.push(n);

        int op = 0; // 0=*, 1=/, 2=+, 3=-

        for (int i = n - 1; i >= 1; i--) {

            if (op == 0) {
                stack.push(stack.pop() * i);
            } 
            else if (op == 1) {
                stack.push(stack.pop() / i);
            } 
            else if (op == 2) {
                stack.push(i);
            } 
            else {
                stack.push(-i);
            }

            op = (op + 1) % 4;
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}