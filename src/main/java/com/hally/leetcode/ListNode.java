package com.hally.leetcode;

/**
 * Created by Kateryna Levshova on 23.10.2015.
 */
public class ListNode
{
	public int value;
	public ListNode next = null;

	public ListNode(int v)
	{
		value = v;
	}

	public ListNode(int v, ListNode nextNode)
	{
		value = v;
		next = nextNode;
	}

	public static String printLinkedList(ListNode currentNode)
	{
		String result = "";
		while (currentNode != null)
		{
			System.out.println(currentNode.value);
			result += currentNode.value;
			currentNode = currentNode.next;
		}
		return result;
	}

}
