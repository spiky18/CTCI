package ctci.chapter4;

public class Problem5 {
	int max=Integer.MIN_VALUE;
	
	public boolean isValidBST(TreeNode root) {
		if(root==null)
			return true;
		return false;
		
	}
	
	public boolean inOrder(TreeNode root){
		inOrder(root.left);
		if(max>root.val)
			return false;
		max=root.val;
		inOrder(root.right);
		return true;
		
	}
}
