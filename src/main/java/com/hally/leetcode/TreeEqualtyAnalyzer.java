package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

/**
 * Created by Kateryna Levshova on 25.10.2015.
 */
public class TreeEqualtyAnalyzer
{
	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		boolean result = true;

		if (p == null && q == null)
		{
			return true;
		}

		if(p.value != q.value)
		{
			return false;
		}

		result =  isSameTreeHelper(p.left, q.left) && isSameTreeHelper(p.right, q.right);


		return result;
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
}
