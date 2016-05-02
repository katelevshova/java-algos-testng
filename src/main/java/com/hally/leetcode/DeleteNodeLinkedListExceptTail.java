package com.hally.leetcode;

import java.util.LinkedList;

/**
 * Created by Kateryna Levshova on 23.10.2015.
 */
public class DeleteNodeLinkedListExceptTail
{
	/**
	 * Task:
	 * Write a function to delete a node (except the tail) in a singly linked list,
	 * given only access to that node.
	 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
	 * the linked list should become 1 -> 2 -> 4 after calling your function.
	 */

	//NOTE: 1 ms
	public void deleteListNode(ListNode listNode)
	{
		if(listNode != null && listNode.next != null)
		{
			listNode.value = listNode.next.value;
			listNode.next = listNode.next.next;
		}
	}
}
