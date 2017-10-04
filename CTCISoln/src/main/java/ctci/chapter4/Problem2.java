package ctci.chapter4;

public class Problem2 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return treeConstructor(nums, 0, nums.length - 1);
	}

	public TreeNode treeConstructor(int[] nums, int start, int end) {
		if (start <= end) {
			int mid = (end + start) / 2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = treeConstructor(nums, start, mid - 1);
			root.right = treeConstructor(nums, mid + 1, end);
			return root;
		}
		return null;
	}
}
