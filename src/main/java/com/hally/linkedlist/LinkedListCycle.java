package com.hally.linkedlist;

/**
 * Created by Kateryna Levshova on 09.05.2016.
 */
public class LinkedListCycle
{
	public boolean hasCycle(ListNode head)
	{
		if(head == null || head.next == null)
		{
			return false;
		}

		ListNode current = head;

		while (current.next != null)
		{
			if(current.next != null && head.next != null)
			{
				if(head.next.next != null)
				{
					if(current.next == head.next.next)
					{
						return true;
					}

					current = current.next;
					head = head.next.next;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}

		return false;
	}
}
