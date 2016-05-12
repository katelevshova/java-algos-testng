package com.hally.linkedlist;

import com.hally.linkedlist.ListNode;
import com.hally.linkedlist.ReverseList;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 03.12.2015.
 */
public class ReverseListTest
{
	@Test
	public void testReverseListRecursion_4_Items()
	{
		//1453
		ListNode listNode4 = new ListNode(3);
		ListNode listNode3 = new ListNode(5, listNode4);
		ListNode listNode2 = new ListNode(4, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		ReverseList solution = new ReverseList();
		String resultString = ListNode.printLinkedList(solution.reverseListRecursive(listNode1));

		Assert.assertEquals(resultString, "3541");
	}


	@Test
	public void testReverseListRecursion_2_Items()
	{
		ListNode listNode2 = new ListNode(4);
		ListNode listNode1 = new ListNode(1, listNode2);

		ReverseList solution = new ReverseList();
		String resultString = ListNode.printLinkedList(solution.reverseListRecursive(listNode1));

		Assert.assertEquals(resultString, "41");
	}

	@Test
	public void testReverseListIterative_4_Items()
	{
		//1453
		ListNode listNode4 = new ListNode(3);
		ListNode listNode3 = new ListNode(5, listNode4);
		ListNode listNode2 = new ListNode(4, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		ReverseList solution = new ReverseList();
		String resultString = ListNode.printLinkedList(solution.reverseListIterative(listNode1));

		Assert.assertEquals(resultString, "3541");
	}

}