package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kateryna Levshova on 28.10.2015.
 */
public class LowestCommonAncestor
{
	/**
	 * Task: Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given
	 * nodes in the BST. According to the definition of LCA on Wikipedia: “The lowest common
	 * ancestor is defined between two nodes v and w as the lowest node in T that has both v and w
	 * as descendants (where we allow a node to be a descendant of itself).”
	 * 				  	6
	 //				/		\
	 //			  2		  	 8
	 //			/	\		 /\
	 //		  0		 4		7	9
	 //				/  \
	 //			  3		5
	 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA
	 * of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA
	 * definition.
	 */

	//Note: 11 ms
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2)
	{
		if (root == null || node1 == null && node2 == null)
		{
			return root;
		}

		if(node1 == null)
		{
			return node2;
		}

		if(node2 == null)
		{
			return node1;
		}

		if (node1.value < root.value && node2.value < root.value)
		{
			return lowestCommonAncestor(root.left, node1, node2);
		}

		if (node2.value > root.value && node1.value > root.value)
		{
			return lowestCommonAncestor(root.right, node1, node2);
		}


		return root;
	}

	public TreeNode lowestCommonAncestorMath(TreeNode root, TreeNode node1, TreeNode node2)
	{
		if (root == null || node1 == null && node2 == null)
		{
			return root;
		}

		if(node1 == null)
		{
			return node2;
		}

		if(node2 == null)
		{
			return node1;
		}

		if (Math.max(node1.value, node2.value) < root.value)
		{
			return lowestCommonAncestor(root.left, node1, node2);
		}

		if (Math.min(node1.value, node2.value) > root.value)
		{
			return lowestCommonAncestor(root.right, node1, node2);
		}

		return root;
	}

	public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode node1, TreeNode node2)
	{
		if (root == null || node1 == null && node2 == null)
		{
			return root;
		}

		if(node1 == null)
		{
			return node2;
		}

		if(node2 == null)
		{
			return node1;
		}

		Queue<TreeNode> queue = new LinkedList();
		queue.offer(root);
		TreeNode node = root;

		while (queue.size() > 0)
		{
			node = queue.poll();

			if (node != null)
			{
				if (node.value < node1.value && node.value < node2.value)
				{
					queue.offer(node.right);
				}

				if (node.value > node1.value && node.value > node2.value)
				{
					queue.offer(node.left);
				}
			}
		}

		return node;
	}
}
