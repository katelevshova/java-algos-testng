package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class TreeInvertSolution
{
	public TreeNode invertTree(TreeNode root)
	{
		if(root == null)
		{
			return null;
		}

		if(root.left == null && root.right == null)
		{
			return root;
		}

		return invertTreeHelper(root.value, root.left, root.right);
	}

	private TreeNode invertTreeHelper(int value, TreeNode leftNode, TreeNode rightNode)
	{
		if(leftNode != null && rightNode != null)
		{
			TreeNode left = invertTreeHelper(rightNode.value, rightNode.left, rightNode.right);
			TreeNode right = invertTreeHelper(leftNode.value, leftNode.left, leftNode.right);
			TreeNode result = new TreeNode(value, left, right);
			return result;
		}

		if(leftNode != null && rightNode == null)
		{
			TreeNode right = invertTreeHelper(leftNode.value, leftNode.left, leftNode.right);
			TreeNode result = new TreeNode(value, null, right);
			return result;
		}

		if(leftNode == null && rightNode != null)
		{
			TreeNode left = invertTreeHelper(rightNode.value, rightNode.left, rightNode.right);
			TreeNode result = new TreeNode(value, left, null);
			return result;
		}

		TreeNode other = new TreeNode(value, leftNode, rightNode);
		return other;
	}
}
