package com.hally.linkedlist;

import com.hally.linkedlist.DeleteLinkedListElements;
import com.hally.linkedlist.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 02.05.2016.
 */
public class DeleteLinkedListElementsTest
{

	@Test
	public void testDeleteElements_Middle_End()
	{
		DeleteLinkedListElements solution = new DeleteLinkedListElements();
		//1-2-6-3-4-5-6
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode( 3, new
				ListNode(4, new ListNode(5, new ListNode(6)))))));

		System.out.println("Input:");
		ListNode.printLinkedList(head);
		System.out.println("Output:");
		String actualResult =  ListNode.printLinkedList(solution.deleteElements(head, 6));
		Assert.assertEquals(actualResult, "12345");
		System.out.println("-------------------");
	}

	@Test
	public void testDeleteElements_Start_Middle_End()
	{
		DeleteLinkedListElements solution = new DeleteLinkedListElements();
		//6-2-6-6-3-4-5-6
		ListNode head = new ListNode(6, new ListNode(2, new ListNode(6, new ListNode( 6, new
				ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))));

		System.out.println("Input:");
		ListNode.printLinkedList(head);
		System.out.println("Output:");
		String actualResult =  ListNode.printLinkedList(solution.deleteElements(head, 6));
		Assert.assertEquals(actualResult, "2345");
		System.out.println("-------------------");
	}
}