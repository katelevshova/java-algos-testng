package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import java.util.LinkedList;

/**
 * Created by Kateryna Levshova on 21.10.2015.
 */
public class TreeMaxDepthAnalyzer
{
	/**
	 * Task:
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path
	 * from the root treeNode down to the farthest leaf treeNode.
	 */

	public int maxDepthRecursion(TreeNode treeNode)
	{
		if(treeNode == null)
		{
			return 0;
		}

		int leftCounter = 0;
		int rightCounter = 0;

		//count left nodes
		if(treeNode.left != null)
		{
			leftCounter = maxDepthRecursion(treeNode.left);
		}

		//count right nodes
		if(treeNode.right != null)
		{
			rightCounter = maxDepthRecursion(treeNode.right);
		}
		//the largest counter add to 1st root treeNode

		return 1 + Math.max(leftCounter, rightCounter);
	}

	public int maxDepthIterative(TreeNode treeNode)
	{
		if(treeNode == null)
		{
			return 0;
		}

		LinkedList<TreeNode> linkedList = new LinkedList<>();
		linkedList.push(treeNode); // push root
		int nodeCounter = 0;
		int resultCounter = 0;

		while (true)
		{
			// indicates nodes number at current layer
			nodeCounter = linkedList.size();

			if(nodeCounter == 0)
			{
				return resultCounter;
			}

			resultCounter++;

			// dequeue all nodes from current level and enqueue all nodes for next level
			while (nodeCounter > 0)
			{
				treeNode = linkedList.getFirst();
				linkedList.pop();

				if(treeNode.left != null)
				{
					linkedList.push(treeNode.left);
				}

				if(treeNode.right != null)
				{
					linkedList.push(treeNode.right);
				}

				nodeCounter--;
			}
		}
	}
}
