package com.hally.linkedlist;

import com.hally.linkedlist.LinkedListCycle;
import com.hally.linkedlist.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 09.05.2016.
 */
public class LinkedListCycleTest
{

	@Test
	public void testHasCycle_True_Full()
	{
		LinkedListCycle solution = new LinkedListCycle();

		// 1-2-3 -> 1-2-3 ->
		ListNode listNode1 = new ListNode(1, new ListNode(2));
		listNode1.next.next = new ListNode(3, listNode1);
		Assert.assertTrue(solution.hasCycle(listNode1));

		// 1-1-1-1 -> 1-1-1-1 ->
		ListNode listNode2 = new ListNode(1, new ListNode(1));
		listNode2.next.next = new ListNode(1, new ListNode(1, listNode2));
		Assert.assertTrue(solution.hasCycle(listNode2));
	}

	@Test
	public void testHasCycle_True_Partial()
	{
		LinkedListCycle solution = new LinkedListCycle();

		// 1-2-3-4-5-6 -> 4-5-6 ->
		ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3)));
		ListNode listNode4 = new ListNode(4, new ListNode(5, new ListNode(6)));
		listNode1.next.next.next = listNode4;
		listNode4.next.next.next = listNode4;

		Assert.assertTrue(solution.hasCycle(listNode1));
	}

	@Test
	public void testHasCycle_False_VeryLong()
	{
		LinkedListCycle solution = new LinkedListCycle();
		//[-21,10,17,8,
		// 4,26,5,35,
		// 33,-7,-16,27,
		// -12,6,29,
		// -12,5,9,
		// 20,14,14,
		// 2,13,-24,
		// 21,23,-21,5]
		ListNode listNode = new ListNode(-21, new ListNode(10, new ListNode(17, new ListNode(8,
				new ListNode(4, new ListNode(26, new ListNode(5, new ListNode(35,
						new ListNode(33, new ListNode(-7, new ListNode(-16, new ListNode(27,
								new ListNode(-12, new ListNode(6, new ListNode(29,
										new ListNode(-12, new ListNode(5, new ListNode(9, new
												ListNode(20, new ListNode(14, new ListNode(14,
												new ListNode(2, new ListNode(13, new ListNode
														(-24, new ListNode(21, new ListNode(23,
																new ListNode(-21, new ListNode(5)
																)))))
												)))))
										))))))))))))
				)))));
		Assert.assertFalse(solution.hasCycle(listNode));

	}

	@Test
	public void testHasCycle_False()
	{
		LinkedListCycle solution = new LinkedListCycle();

		// 1-2-3-null
		ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
		Assert.assertFalse(solution.hasCycle(listNode1));

		Assert.assertFalse(solution.hasCycle(null));
		Assert.assertFalse(solution.hasCycle(new ListNode(1, null)));
	}
}