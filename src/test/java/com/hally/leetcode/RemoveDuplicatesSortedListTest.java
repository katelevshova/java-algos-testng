package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 09.12.2015.
 */
public class RemoveDuplicatesSortedListTest
{
	@Test
	public void testDeleteDuplicates_1_Duplicate()
	{
		//1-1-2-3
		RemoveDuplicatesSortedList solution = new RemoveDuplicatesSortedList();
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3))));

		String actualResult = ListNode.printLinkedList(solution.deleteDuplicates(head));

		Assert.assertEquals(actualResult, "123");
	}

	@Test
	public void testDeleteDuplicates_2_Duplicates()
	{
		//1-1-2-3-3-3
		RemoveDuplicatesSortedList solution = new RemoveDuplicatesSortedList();
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new
				ListNode(3, new ListNode(3))))));

		String actualResult = ListNode.printLinkedList(solution.deleteDuplicates(head));

		Assert.assertEquals(actualResult, "123");
	}

	@Test
	public void testDeleteDuplicates_All_Duplicates()
	{
		//1-1-1-2-2-3-3-3
		RemoveDuplicatesSortedList solution = new RemoveDuplicatesSortedList();
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new
				ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3))))))));

		String actualResult = ListNode.printLinkedList(solution.deleteDuplicates(head));

		Assert.assertEquals(actualResult, "123");
	}

	@Test
	public void testDeleteDuplicates_No_Duplicates()
	{
		//1-2-3-4-5-6
		RemoveDuplicatesSortedList solution = new RemoveDuplicatesSortedList();
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new
				ListNode(5, new ListNode(6))))));

		String actualResult = ListNode.printLinkedList(solution.deleteDuplicates(head));

		Assert.assertEquals(actualResult, "123456");
	}

}