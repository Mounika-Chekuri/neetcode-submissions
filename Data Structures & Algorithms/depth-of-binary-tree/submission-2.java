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
class Pair
{
    TreeNode node;
    int depth; 
    Pair(TreeNode node, int depth)
    {
        this.node = node;
        this.depth = depth;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,1));
        int maxlen = 1;
        while(!queue.isEmpty())
        {
            int s = queue.size();
            for(int i=0;i<s;i++)
            {
                Pair p = queue.poll();
                if(p.node.left!=null) queue.add(new Pair(p.node.left,p.depth+1));
                if(p.node.right!=null) queue.add(new Pair(p.node.right,p.depth+1));
                maxlen = Math.max(maxlen,p.depth);
            }
        }
        return maxlen;
        
    }
}
