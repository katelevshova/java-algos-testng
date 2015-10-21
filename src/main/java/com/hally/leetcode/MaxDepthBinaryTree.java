package com.hally.leetcode;

import com.hally.taskAp.Node;

/**
 * Created by Oni on 21.10.2015.
 */
public class MaxDepthBinaryTree
{
	/**
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 */

	public int maxDepth(Node node)
	{
		if(node == null)
		{
			return 0;
		}

		int leftCounter = 0;
		int rightCounter = 0;

		//count left nodes
		if(node.left != null)
		{
			leftCounter = maxDepth(node.left);
		}

		//count right nodes
		if(node.right != null)
		{
			rightCounter = maxDepth(node.right);
		}
		//the largest counter add to 1st root node

		return 1 + Math.max(leftCounter, rightCounter);
	}
}
