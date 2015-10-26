package com.hally.taskAp;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class TreeSymmetryAnalyzer
{
	/**
	 * Checks if the Tree is symmetric
	 * @param parent
	 * @return true - if symmetric, false - if is not
	 */
	public Boolean isSymmetricRecursion(TreeNode parent)
	{
		if (parent == null)
		{
			return true;
		}

		return isSymmetricHelper(parent.left, parent.right);
	}

	/**
	 * A helper method for <code>isSymmetric</code> method. Checks internal nodes.
	 * @param leftTreeNode
	 * @param rightTreeNode
	 * @return
	 */
	private Boolean isSymmetricHelper(TreeNode leftTreeNode, TreeNode rightTreeNode)
	{
		Boolean result = false;

		// If both null then true
		if (leftTreeNode == null && rightTreeNode == null)
		{
			result = true;
		}

		if (leftTreeNode != null && rightTreeNode != null)
		{
			result = (leftTreeNode.value == rightTreeNode.value)
					&& isSymmetricHelper(leftTreeNode.left, rightTreeNode.right)
					&& isSymmetricHelper(leftTreeNode.right, rightTreeNode.left);
		}

		return  result;
	}

	public Boolean isSymmetricIterative(TreeNode treeNode)
	{
		Boolean result = true;

		if(treeNode == null)
		{
			return false;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(treeNode.left);
		queue.offer(treeNode.right);

		while (!queue.isEmpty())
		{
			TreeNode leftTreeNode = queue.poll();
			TreeNode rightTreeNode = queue.poll();

			if(leftTreeNode == null && rightTreeNode == null)
			{
				result = true;
			}
			else if (leftTreeNode == null || rightTreeNode == null || leftTreeNode.value != rightTreeNode.value)
			{
				result = false;
				break;
			}
			else if(leftTreeNode != null && rightTreeNode != null)
			{
				queue.offer(leftTreeNode.left);
				queue.offer(rightTreeNode.right);

				queue.offer(leftTreeNode.right);
				queue.offer(rightTreeNode.left);
			}
		}

		return result;
	}
}
