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
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level)
    {
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,1));
        int level=0;
        while(!q.isEmpty())
        {
            
            Pair p = q.poll();
            level = p.level;

            if(p.node.left!=null) q.offer(new Pair(p.node.left,level+1));
            if(p.node.right!=null) q.offer(new Pair(p.node.right,level+1));

        }
        return level;
    }
}
