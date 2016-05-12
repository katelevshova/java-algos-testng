package com.hally.linkedlist;

/**
 * Created by Kateryna Levshova on 02.05.2016.
 */
public class DeleteLinkedListElements
{
	/*
	Remove all elements from a linked list of integers that have value val.

	Example
	Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
	Return: 1 --> 2 --> 3 --> 4 --> 5
	*/

	public ListNode deleteElements(ListNode head, int val)
	{
		// tmp will store 0-1-2-6-3-4-5-6 (with additional 0 in the beginning)
		// current will be like a cursor each time
		ListNode current, tmp = new ListNode(0);
		current = tmp;
		tmp.next = head;

		while (current.next != null)
		{
			if (current.next.value == val)
			{
				current.next = current.next.next;  //delete the element
			}
			else
			{
				current = current.next;  // one step forward
			}
		}
		return tmp.next; // since we did no move from it anywhere will return everything withou
		// first 0
	}
}
