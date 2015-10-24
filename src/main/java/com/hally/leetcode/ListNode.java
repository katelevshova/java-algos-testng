package com.hally.leetcode;

/**
 * Created by Kateryna Levshova on 23.10.2015.
 */
public class ListNode
{
	public int value;
	public ListNode next = null;

	public void ListNode(int v)
	{
		value = v;
	}

	public void ListNode(int v, ListNode nextNode)
	{
		value = v;
		next = nextNode;
	}

}
