package com.hally.leetcode;

/**
 * Created by Kateryna Levshova on 09.12.2015.
 */
public class RemoveDuplicatesSortedList
{
	/*
	 Given a sorted linked list, delete all duplicates such that each element appear only once.

	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
	 */

	public ListNode deleteDuplicates(ListNode head)
	{
		if (head == null || head.next == null)
		{
			return head;
		}

		ListNode current = head;

		while (current.next != null)
		{
			if (current.value == current.next.value)
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
		}

		return head;
	}
}
