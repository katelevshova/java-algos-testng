package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class TreeInvertSolution
{
	//Note: best implementation
	public TreeNode invertTreeRecursion(TreeNode root)
	{
		if(root == null)
		{
			return root;
		}

		TreeNode noteTmp = root.left;
		root.left = invertTreeRecursion(root.right);
		root.right = invertTreeRecursion(noteTmp);

		return root;
	}

	//Note: 1st implementation
	public TreeNode invertTreeRecursionOldVersion(TreeNode root)
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

		TreeNode result = new TreeNode(value, leftNode, rightNode);
		return result;
	}
}
