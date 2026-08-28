/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void InOrder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }

        InOrder(root.left, arr);
        arr.add(root.val);
        InOrder(root.right, arr);
    }

    public int[] findMode(TreeNode root) {

        List<Integer> arr = new ArrayList<>();
        InOrder(root, arr);

        List<Integer> result = new ArrayList<>();

        int max = 0;
        int count = 0;

        
        for (int i = 0; i < arr.size(); i++) {

            if (i == 0 || !arr.get(i).equals(arr.get(i - 1))) {
                count = 1;
            } else {
                count++;
            }

            max = Math.max(max, count);
        }

        
        count = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (i == 0 || !arr.get(i).equals(arr.get(i - 1))) {
                count = 1;
            } else {
                count++;
            }

            if (count == max) {
                result.add(arr.get(i));
            }
        }

        
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}