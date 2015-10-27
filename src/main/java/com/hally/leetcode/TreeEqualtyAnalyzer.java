package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kateryna Levshova on 25.10.2015.
 */
public class TreeEqualtyAnalyzer
{
	public boolean isSameTreeRecursion(TreeNode node1, TreeNode node2)
	{
		if (node1 == null && node2 == null)
		{
			return true;
		}

		if(node1 == null || node2 == null)
		{
			return false;
		}

		if(node1.value != node2.value)
		{
			return false;
		}

		return  isSameTreeHelper(node1.left, node2.left) && isSameTreeHelper(node1.right, node2.right);
	}

	private boolean isSameTreeHelper(TreeNode node1, TreeNode node2)
	{
		boolean result = false;

		if (node1 == null && node2 == null)
		{
			return true;
		}

		if (node1 != null && node2 != null)
		{
			result = node1.value == node2.value && isSameTreeHelper(node1.left, node2.left) &&
					isSameTreeHelper(node1.right, node2.right);
		}

		return result;
	}

	public boolean isSameTreeIterative(TreeNode node1, TreeNode node2)
	{
		boolean result = false;

		if (node1 == null && node2 == null)
		{
			return true;
		}

		if(node1 == null || node2 == null)
		{
			return false;
		}

		if(node1.value != node2.value)
		{
			return false;
		}

		LinkedList<TreeNode> linkedList = new LinkedList<>();
		linkedList.push(node1);
		linkedList.push(node2);
		int nodeCounter = 0;

		while (true)
		{
			nodeCounter = linkedList.size();

			if(nodeCounter == 0)
			{
				return result;
			}

			// dequeue all nodes from current level and enqueue all nodes for next level
			while (nodeCounter > 0)
			{
				node1 = linkedList.pop();
				node2 = linkedList.pop();
				result = true;

				if(node1.left != null && node2.left != null)
				{
					if(node1.left.value != node2.left.value)
					{
						return false;
					}

					linkedList.push(node1.left);
					linkedList.push(node2.left);
				}

				if((node1.left == null && node2.left != null)
						|| (node1.left != null && node2.left == null))
				{
					return false;
				}

				if(node1.right != null && node2.right != null)
				{
					if(node1.right.value != node2.right.value)
					{
						return false;
					}

					linkedList.push(node1.right);
					linkedList.push(node2.right);
				}

				if((node1.right == null && node2.right != null)
						|| (node1.right != null && node2.right == null))
				{
					return false;
				}

				nodeCounter -= 2; // because we compare 2 trees
			}
		}
	}
}
