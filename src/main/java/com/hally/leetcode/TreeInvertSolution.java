package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class TreeInvertSolution
{
	public TreeNode invertTreeRecursion(TreeNode root)
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

	//TODO: finish this method
//	public TreeNode invertTreeIterative(TreeNode root)
//	{
//		if(root == null)
//		{
//			return null;
//		}
//
//		if(root.left == null && root.right == null)
//		{
//			return root;
//		}
//
//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.offer(root.left);
//		queue.offer(root.right);
//		TreeNode result = new TreeNode(root.value);
//
//		int nodeCounter = 0;
//
//		while (true)
//		{
//			nodeCounter = queue.size();
//
//			if(nodeCounter == 0)
//			{
//				return result;
//			}
//
//			// dequeue all nodes from current level and enqueue all nodes for next level
//			while (nodeCounter > 0)
//			{
//				TreeNode leftNode = queue.poll();
//				TreeNode rightNode = queue.poll();
//
////				result.left = new TreeNode(rightNode.value, rightNode.right, rightNode.left);
////				result.right = new TreeNode(leftNode.value, leftNode.right, leftNode.left);
//
//				TreeNode newLeft = new TreeNode(rightNode.value, rightNode.left, rightNode.right);
//				TreeNode newRight = new TreeNode(leftNode.value, leftNode.left, leftNode.right);
//
//				result.left = newLeft;
//				result.right = newRight;
//
//				if(newLeft.left != null && newLeft.right != null)
//				{
//					queue.offer(newLeft.left);
//					queue.offer(newLeft.right);
//				}
//
//				if(newRight.left != null && newRight.right != null)
//				{
//					queue.offer(rightNode.left);
//					queue.offer(rightNode.right);
//				}
//
//				nodeCounter -= 2;
//			}
//		}
//	}
}
