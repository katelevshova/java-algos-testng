package com.hally.tree;

import com.hally.tree.TreeMaxDepthAnalyzer;
import com.hally.tree.TreeNode;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 21.10.2015.
 */
public class TreeMaxDepthAnalyzerTest
{
	private TreeMaxDepthAnalyzer _treeMaxDepthAnalyzer;
	private TreeNode _root;

	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		_treeMaxDepthAnalyzer = new TreeMaxDepthAnalyzer();
	}

	@Test
	public void maxDepth_Single_Root_Node()
	{
		_root = new TreeNode(10);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(_root), 1);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(_root), 1);
	}

	@Test
	public void maxDepth_Zero_Nodes()
	{
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(null), 0);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(null), 0);
	}

	@Test
	public void testIsSymmetric_Root_and_2_Leaf_Nodes()
	{
//				10
//				/\
//			20		20
		_root = new TreeNode(10, new TreeNode(20), new TreeNode(20));
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(_root), 2);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(_root), 2);
	}

	@Test
	public void testIsSymmetric_3_Level_Left_Deeper_2_Leafs()
	{
//				10
//				/\
//			20		20
//			/\
//		45		7
		TreeNode left = new TreeNode(20, new TreeNode(45), new TreeNode(7));
		TreeNode right = new TreeNode(20);
		_root = new TreeNode(10, left, right);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(_root), 3);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(_root), 3);
	}

	@Test
	public void testIsSymmetric_3_Level__Left_Deeper_1_Leaf()
	{
//				10
//				/\
//			20		20
//			/
//		45
		TreeNode left = new TreeNode(20, new TreeNode(45), null);
		TreeNode right = new TreeNode(20);
		_root = new TreeNode(10, left, right);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(_root), 3);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(_root), 3);
	}

	@Test
	public void testIsSymmetric_3_Level_Right_Deeper_2_Leafs()
	{
//				10
//				/\
//			20		20
//					/\
//				15		9
		TreeNode left = new TreeNode(20);
		TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(9));
		_root = new TreeNode(10, left, right);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(_root), 3);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(_root), 3);
	}


	@Test
	public void testIsSymmetric_3_Level_Right_Deeper_1_Leaf()
	{
//				10
//				/\
//			20		20
//					/
//				15
		TreeNode left = new TreeNode(20);
		TreeNode right = new TreeNode(20, new TreeNode(15), null);
		_root = new TreeNode(10, left, right);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(_root), 3);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(_root), 3);
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

		TreeNode right = new TreeNode(20, null, new TreeNode(5, null, new TreeNode(3)));
		_root = new TreeNode(10, null, right);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthRecursion(_root), 4);
		Assert.assertEquals(_treeMaxDepthAnalyzer.maxDepthIterative(_root), 4);
	}
}
