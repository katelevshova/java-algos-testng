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

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root == null || p == null && q == null)
		{
			return root;
		}

		TreeNode resultNode = root;

		TreeNode left = lowestCommonAncestor(p,p.left, p.right);

		return resultNode;
	}

}
