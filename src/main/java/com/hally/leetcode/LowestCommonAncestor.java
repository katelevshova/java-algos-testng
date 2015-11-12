package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

/**
 * Created by Kateryna Levshova on 28.10.2015.
 */
public class LowestCommonAncestor
{
	/**
	 * Task:
	 *  Given a binary search tree (BST), find the lowest common ancestor (LCA)
	 *  of two given nodes in the BST. According to the definition of LCA on Wikipedia:
	 *  “The lowest common ancestor is defined between two nodes v and w as the lowest node in T
	 *  that has both v and w as descendants (where we allow a node to be a descendant of itself).”
	 *
	 *  			  6
	 *  		   / 	\
	 *  		  2   	  8
	 *  		 /	\	 / \
	 *  		0  	4	7	9
	 *				/\
	 *			   3  5
	 *
	 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6.
	 * Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself
	 * according to the LCA definition.
	 */

	//Note: 11 ms
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode left, TreeNode right)
	{
		if(root == null || left == null && right == null)
		{
			return root;
		}

		if(left.value < root.value && right.value < root.value)
		{
			return lowestCommonAncestor(root.left, left, right);
		}

		if(right.value > root.value && left.value > root.value)
		{
			return lowestCommonAncestor(root.right, left, right);
		}


		return root;
	}

	public TreeNode lowestCommonAncestorMath(TreeNode root, TreeNode left, TreeNode right)
	{
		if(root == null || left == null && right == null)
		{
			return root;
		}

		if(Math.max(left.value, right.value) < root.value)
		{
			return lowestCommonAncestor(root.left, left, right);
		}

		if(Math.min(left.value, right.value) > root.value)
		{
			return lowestCommonAncestor(root.right, left, right);
		}

		return root;
	}
}
