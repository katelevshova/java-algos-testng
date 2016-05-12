package com.hally.linkedlist;

import com.hally.linkedlist.DeleteNodeLinkedListExceptTail;
import com.hally.linkedlist.ListNode;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 23.10.2015.
 */
public class DeleteNodeLinkedListExceptTailTest
{
	private DeleteNodeLinkedListExceptTail _deleteNodeLinkedListExceptTail;

	@BeforeSuite
	public void setUp()
	{
		_deleteNodeLinkedListExceptTail = new DeleteNodeLinkedListExceptTail();
	}

	@Test
	public void deleteListNode_2nd_From_4()
	{
		ListNode listNode4 = new ListNode(4);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		System.out.println("Before delete:");
		String actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "1234");

		_deleteNodeLinkedListExceptTail.deleteListNode(listNode2);

		System.out.println("After delete node 2:");
		actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "134");
	}

	@Test
	public void deleteListNode_3rd_From_4()
	{
		ListNode listNode4 = new ListNode(4);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		System.out.println("Before delete:");
		String actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "1234");

		_deleteNodeLinkedListExceptTail.deleteListNode(listNode3);

		System.out.println("After delete node 3:");
		actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "124");
	}

	@Test
	public void deleteListNode_1st_From_4()
	{
		ListNode listNode4 = new ListNode(4);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		System.out.println("Before delete:");
		String actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "1234");

		_deleteNodeLinkedListExceptTail.deleteListNode(listNode1);

		System.out.println("After delete node 1:");
		actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "234");
	}

	@Test
	public void deleteListNode_Last_From_4()
	{
		ListNode listNode4 = new ListNode(4);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		System.out.println("Before delete:");
		String actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "1234");

		_deleteNodeLinkedListExceptTail.deleteListNode(listNode4);

		System.out.println("After delete node 4:");
		actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "1234");
	}

	@Test
	public void deleteListNode_Null_From_4()
	{
		ListNode listNode4 = new ListNode(4);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		System.out.println("Before delete:");
		String actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "1234");

		_deleteNodeLinkedListExceptTail.deleteListNode(null);

		System.out.println("After delete node null:");
		actualResult = ListNode.printLinkedList(listNode1);
		Assert.assertEquals(actualResult, "1234");
	}


}
