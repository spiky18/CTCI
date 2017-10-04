package ctci.chapter4;

public class Problem4 {
	 public boolean isBalanced(TreeNode root) {
		 if(root==null || (root.left==null && root.right==null))
			 return true;
		 int hl=height(root.left);
		 int hr=height(root.right);
		 if(Math.abs(hl-hr)>1)
			 return false;
		 return isBalanced(root.left)&&isBalanced(root.right);
	    }
	 
	 public int height(TreeNode root){
		 if(root==null)
			 return 0;
		 return 1+Math.max(height(root.left), height(root.right));
	 }
	 
	 public boolean isBalancedII(TreeNode root) {
		 if(root==null || (root.left==null && root.right==null))
			 return true;
		 return heightII(root)!=-1;
	    }
	 
	 public int heightII(TreeNode root){
		 if(root==null)
			 return 0;
		 int hl=height(root.left);
		 int hr=height(root.right);
		 if(hl==-1 || hr==-1)
			 return -1;
		 return Math.abs(hl-hr)>1?-1:1+Math.max(hl, hr);
	 }
}
