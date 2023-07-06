class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SumRange {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root,low,high);

    }

    private int helper(TreeNode root, int low, int high){
        //base
        if(root==null)return 0;
        //logic
        int temp = 0;
        if(root.val>=low && root.val<=high){
            temp = root.val;
        }
        int left = helper(root.left,low,high);
        int right = helper(root.right,low,high);
        return temp+left+right;

    }
}
