package com.hally.taskAp;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class TreeNode
{
	public int value;
	public TreeNode left = null;
	public TreeNode right = null;

	public TreeNode(int v)
	{
		value = v;
	}

	public TreeNode(int v, TreeNode l, TreeNode r)
	{
		value = v;
		left = l;
		right = r;
	}
}
