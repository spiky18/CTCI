package ctci.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem3 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		if(root==null)
			return list;
		queue.add(root);
		queue.add(null);
		List<Integer> levellist=new ArrayList<Integer>();
		while(!queue.isEmpty()){
			TreeNode temp=queue.poll();
			if(temp!=null){
				levellist.add(temp.val);
				if(temp.left!=null)
					queue.add(temp.left);
				if(temp.right!=null)
					queue.add(temp.right);
			}
			else{
				List<Integer> tempList=new ArrayList<Integer>(levellist);
				//tempList.addAll(levellist);
				list.add(tempList);
				levellist.clear();
				if(!queue.isEmpty())
					queue.add(null);
			}
		}
		return list;
	}
	

}
