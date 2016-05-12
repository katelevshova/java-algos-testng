package com.hally.linkedlist;

/**
 * Created by Kateryna Levshova on 03.12.2015.
 */
public class ReverseList
{
	/*
	Task: Reverse a singly linked list.
	 */

	public ListNode reverseListRecursive(ListNode head)
	{
		if (head == null || head.next == null)
		{
			return head;
		}

		ListNode root = reverseListRecursive(head.next);

		head.next.next = head;
		head.next = null;

		return root;
	}


	public ListNode reverseListIterative(ListNode head)
	{
		if (head == null || head.next == null)
		{
			return head;
		}

		ListNode current = head;
		ListNode tmp = null;
		ListNode prev = null;

		while (current != null)
		{
			tmp = current;
			current = current.next;
			tmp.next = prev;
			prev = tmp;
		}

		return prev;
	}
}
