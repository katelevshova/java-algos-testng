package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class TreeInvertSolutionTest
{
	private TreeInvertSolution _treeInvertSolution;
	private TreeEqualtyAnalyzer _treeEqualtyAnalyzer;

	@BeforeSuite(alwaysRun = true)
	public void setUp()
	{
		_treeInvertSolution = new TreeInvertSolution();
		_treeEqualtyAnalyzer = new TreeEqualtyAnalyzer();
	}

	@Test
	public void invertTree_3_Level_Left()
	{
//	actual:		10			expected:	10
//				/\						/\
//			20		50				50		20
//			/\								/\
//		45		7						  7   45
		TreeNode left = new TreeNode(20, new TreeNode(45), new TreeNode(7));
		TreeNode right = new TreeNode(50);
		TreeNode root = new TreeNode(10, left, right);
		TreeNode actualNode = _treeInvertSolution.invertTreeRecursion(root);

		TreeNode leftExp = new TreeNode(50);
		TreeNode rightExp = new TreeNode(20, new TreeNode(7), new TreeNode(45));
		TreeNode expectedNode = new TreeNode(10, leftExp, rightExp);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNode, expectedNode));

//		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(root);
//		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeIterative, expectedNode));
	}

	@Test
	public void invertTree_3_Level_Right()
	{
//	actual:		10			expected:	10
//				/\						/\
//			30		50				50		30
//					 \				/
//						40		 40
		TreeNode left = new TreeNode(30);
		TreeNode right = new TreeNode(50, null, new TreeNode(40));
		TreeNode root = new TreeNode(10, left, right);
		TreeNode actualNode = _treeInvertSolution.invertTreeRecursion(root);

		TreeNode leftExp = new TreeNode(50, new TreeNode(40), null);
		TreeNode rightExp = new TreeNode(30);
		TreeNode expectedNode = new TreeNode(10, leftExp, rightExp);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNode, expectedNode));
	}

	@Test
	public void invertTree_Single_Root()
	{
//	actual:		10			expected:	10
		TreeNode root = new TreeNode(10);
		TreeNode actualNode = _treeInvertSolution.invertTreeRecursion(root);
		Assert.assertTrue(actualNode.left == null);
		Assert.assertTrue(actualNode.right == null);
		Assert.assertTrue(actualNode.value == 10);
	}

	@Test
	public void invertTree_Null()
	{
		TreeNode actualNode = _treeInvertSolution.invertTreeRecursion(null);
		Assert.assertTrue(actualNode == null);
	}

	@Test
	public void invertTree_2_Level()
	{
//	actual:		10			expected:	10
//				/\						/\
//			20		50				50		20
		TreeNode root = new TreeNode(10, new TreeNode(20), new TreeNode(50));
		TreeNode actualNodeRecursion = _treeInvertSolution.invertTreeRecursion(root);

		TreeNode expectedNode = new TreeNode(10, new TreeNode(50), new TreeNode(20));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeRecursion, expectedNode));

//		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(root);
//		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeIterative, expectedNode));
	}

	@Test
	public void invertTree_3_Level_Only_Right()
	{
//	actual:		10			expected:	10
//				 \						/
//					50				50
//					 \				/
//						40		 40
		TreeNode right = new TreeNode(50, null, new TreeNode(40));
		TreeNode root = new TreeNode(10, null, right);
		TreeNode actualNode = _treeInvertSolution.invertTreeRecursion(root);

		TreeNode leftExp = new TreeNode(50, new TreeNode(40), null);
		TreeNode expectedNode = new TreeNode(10, leftExp, null);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNode, expectedNode));
	}

	@Test
	public void invertTree_3_Level_Only_Left()
	{
//	actual:		10			expected:	10
//				/						 \
//			  25							25
//			/	 							 \
//		  5					 					5
		TreeNode left = new TreeNode(25, new TreeNode(5), null);
		TreeNode root = new TreeNode(10, left, null );
		TreeNode actualNode = _treeInvertSolution.invertTreeRecursion(root);

		TreeNode rightExp = new TreeNode(25, null, new TreeNode(5));
		TreeNode expectedNode = new TreeNode(10, null, rightExp);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNode, expectedNode));
	}
}
