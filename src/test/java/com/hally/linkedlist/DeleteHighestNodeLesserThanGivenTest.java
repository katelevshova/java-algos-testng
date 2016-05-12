package com.hally.linkedlist;

import com.hally.linkedlist.DeleteHighestNodeLesserThanGiven;
import com.hally.linkedlist.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 17.12.2015.
 */
public class DeleteHighestNodeLesserThanGivenTest
{
	@Test
	public void testDeleteNode_Sorted_Normal_Order()
	{
		DeleteHighestNodeLesserThanGiven solution = new DeleteHighestNodeLesserThanGiven();
		//1-2-3-4-5
		ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new
				ListNode(5)))));
		System.out.println("Input:");
		ListNode.printLinkedList(listNode);
		System.out.println("Output:");
		String actualResult =  ListNode.printLinkedList(solution.deleteNode(4, listNode));
		Assert.assertEquals(actualResult, "1245");
		System.out.println("-------------------");
	}

	@Test
	public void testDeleteNode_Sorted_Middle()
	{
		DeleteHighestNodeLesserThanGiven solution = new DeleteHighestNodeLesserThanGiven();
		//1-3-6-8-10
		ListNode listNode = new ListNode(1, new ListNode(3, new ListNode(6, new ListNode(8, new
				ListNode(10)))));
		System.out.println("Input:");
		ListNode.printLinkedList(listNode);
		System.out.println("Output:");
		String actualResult =  ListNode.printLinkedList(solution.deleteNode(8, listNode));
		Assert.assertEquals(actualResult, "13810");
		System.out.println("-------------------");
	}

	@Test
	public void testDeleteNode_Not_Existed_Value()
	{
		DeleteHighestNodeLesserThanGiven solution = new DeleteHighestNodeLesserThanGiven();
		//1-3-6-8-10
		ListNode listNode = new ListNode(1, new ListNode(3, new ListNode(6, new ListNode(8, new
				ListNode(10)))));
		System.out.println("Input:");
		ListNode.printLinkedList(listNode);
		System.out.println("Output:");
		String actualResult =  ListNode.printLinkedList(solution.deleteNode(15, listNode));
		Assert.assertEquals(actualResult, "136810");
		System.out.println("-------------------");
	}

	@Test
	public void testDeleteNode_Two_Nodes_First()
	{
		DeleteHighestNodeLesserThanGiven solution = new DeleteHighestNodeLesserThanGiven();
		//1-3
		ListNode listNode = new ListNode(1, new ListNode(3));
		System.out.println("Input:");
		ListNode.printLinkedList(listNode);
		System.out.println("Output:");
		String actualResult =  ListNode.printLinkedList(solution.deleteNode(1, listNode));
		Assert.assertEquals(actualResult, "13");
		System.out.println("-------------------");
	}

	@Test
	public void testDeleteNode_Two_Nodes_Second()
	{
		DeleteHighestNodeLesserThanGiven solution = new DeleteHighestNodeLesserThanGiven();
		//1-3
		ListNode listNode = new ListNode(1, new ListNode(3));
		System.out.println("Input:");
		ListNode.printLinkedList(listNode);
		System.out.println("Output:");
		String actualResult =  ListNode.printLinkedList(solution.deleteNode(3, listNode));
		Assert.assertEquals(actualResult, "3");
		System.out.println("-------------------");
	}

	@Test
	public void testDeleteNode_Null()
	{
		DeleteHighestNodeLesserThanGiven solution = new DeleteHighestNodeLesserThanGiven();
		Assert.assertEquals(solution.deleteNode(3, null), null);
		Assert.assertEquals(ListNode.printLinkedList(solution.deleteNode(1, new ListNode(1))), "1");

	}
}