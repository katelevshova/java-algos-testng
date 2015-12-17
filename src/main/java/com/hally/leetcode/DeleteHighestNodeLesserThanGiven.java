package com.hally.leetcode;

/**
 * Created by Kateryna Levshova on 17.12.2015.
 */
public class DeleteHighestNodeLesserThanGiven
{
	/*
		Task: in a sorted LinkedList how do you delete the highest number less than the given number?
		Input: 1,2,3,4,5,6
		node:4
		Output: 1,2,4,5,6
	 */
	public ListNode deleteNode(int value, ListNode head)
	{
		if (head == null || head.next == null)
		{
			return head;
		}

		ListNode current = head;

		while (current.next != null)
		{
			if (current.next.value == value)
			{
				current.value = current.next.value;
				current.next = current.next.next;
				break;
			}
			else
			{
				current = current.next;
			}
		}

		return head;
	}
}
