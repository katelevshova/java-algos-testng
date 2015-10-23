package com.hally.leetcode;

import com.hally.taskAp.Node;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Oni on 21.10.2015.
 */
public class MaxDepthBinaryTreeTest
{
	private MaxDepthBinaryTree _maxDepthBinaryTree;
	private Node _root;

	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		_maxDepthBinaryTree = new MaxDepthBinaryTree();
	}

	@Test
	public void maxDepth_Single_Root_Node()
	{
		_root = new Node(10);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(_root), 1);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(_root), 1);
	}

	@Test
	public void maxDepth_Zero_Nodes()
	{
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(null), 0);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(null), 0);
	}

	@Test
	public void testIsSymmetric_Root_and_2_Leaf_Nodes()
	{
//				10
//				/\
//			20		20
		_root = new Node(10, new Node(20), new Node(20));
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(_root), 2);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(_root), 2);
	}

	@Test
	public void testIsSymmetric_3_Level_Left_Deeper_2_Leafs()
	{
//				10
//				/\
//			20		20
//			/\
//		45		7
		Node left = new Node(20, new Node(45), new Node(7));
		Node right = new Node(20);
		_root = new Node(10, left, right);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(_root), 3);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(_root), 3);
	}

	@Test
	public void testIsSymmetric_3_Level__Left_Deeper_1_Leaf()
	{
//				10
//				/\
//			20		20
//			/
//		45
		Node left = new Node(20, new Node(45), null);
		Node right = new Node(20);
		_root = new Node(10, left, right);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(_root), 3);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(_root), 3);
	}

	@Test
	public void testIsSymmetric_3_Level_Right_Deeper_2_Leafs()
	{
//				10
//				/\
//			20		20
//					/\
//				15		9
		Node left = new Node(20);
		Node right = new Node(20, new Node(15), new Node(9));
		_root = new Node(10, left, right);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(_root), 3);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(_root), 3);
	}


	@Test
	public void testIsSymmetric_3_Level_Right_Deeper_1_Leaf()
	{
//				10
//				/\
//			20		20
//					/
//				15
		Node left = new Node(20);
		Node right = new Node(20, new Node(15), null);
		_root = new Node(10, left, right);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(_root), 3);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(_root), 3);
	}

	@Test
	public void testIsSymmetric_4_Level()
	{
//				10
//				\
//					20
//					\
//						5
//						\
//							3

		Node right = new Node(20, null, new Node(5, null, new Node(3)));
		_root = new Node(10, null, right);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepth(_root), 4);
		Assert.assertEquals(_maxDepthBinaryTree.maxDepthIterative(_root), 4);
	}
}
