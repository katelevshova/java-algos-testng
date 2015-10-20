package com.hally.taskAp;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class Node
{
	public int value;
	public Node left = null;
	public Node right = null;

	public Node(int v)
	{
		value = v;
	}

	public Node(int v, Node l, Node r)
	{
		value = v;
		left = l;
		right = r;
	}
}
