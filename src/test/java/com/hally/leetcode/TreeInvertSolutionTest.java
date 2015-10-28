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
	public void invertTreeRecursion_3_Level_Left()
	{
//	actual:		10			expected:	10
//				/\						/\
//			20		50				50		20
//			/\								/\
//		45		7						  7   45
		TreeNode left = new TreeNode(20, new TreeNode(45), new TreeNode(7));
		TreeNode right = new TreeNode(50);
		TreeNode root = new TreeNode(10, left, right);

		TreeNode leftExp = new TreeNode(50);
		TreeNode rightExp = new TreeNode(20, new TreeNode(7), new TreeNode(45));
		TreeNode expectedNode = new TreeNode(10, leftExp, rightExp);

		TreeNode actualNodeRecursion = _treeInvertSolution.invertTreeRecursion(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeRecursion, expectedNode));
	}

	@Test
	public void invertTreeIterative_3_Level_Left()
	{
//	actual:		10			expected:	10
//				/\						/\
//			20		50				50		20
//			/\								/\
//		45		7						  7   45
		TreeNode left = new TreeNode(20, new TreeNode(45), new TreeNode(7));
		TreeNode right = new TreeNode(50);
		TreeNode root = new TreeNode(10, left, right);


		TreeNode leftExp = new TreeNode(50);
		TreeNode rightExp = new TreeNode(20, new TreeNode(7), new TreeNode(45));
		TreeNode expectedNode = new TreeNode(10, leftExp, rightExp);

		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeIterative, expectedNode));
	}

	@Test
	public void invertTreeRecursion_3_Level_Right()
	{
//	actual:		10			expected:	10
//				/\						/\
//			30		50				50		30
//					 \				/
//						40		 40
		TreeNode left = new TreeNode(30);
		TreeNode right = new TreeNode(50, null, new TreeNode(40));
		TreeNode root = new TreeNode(10, left, right);

		TreeNode leftExp = new TreeNode(50, new TreeNode(40), null);
		TreeNode rightExp = new TreeNode(30);
		TreeNode expectedNode = new TreeNode(10, leftExp, rightExp);

		TreeNode actualNodeRecursion = _treeInvertSolution.invertTreeRecursion(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeRecursion, expectedNode));
	}

	@Test
	public void invertTreeIterative_3_Level_Right()
	{
//	actual:		10			expected:	10
//				/\						/\
//			30		50				50		30
//					 \				/
//						40		 40
		TreeNode left = new TreeNode(30);
		TreeNode right = new TreeNode(50, null, new TreeNode(40));
		TreeNode root = new TreeNode(10, left, right);

		TreeNode leftExp = new TreeNode(50, new TreeNode(40), null);
		TreeNode rightExp = new TreeNode(30);
		TreeNode expectedNode = new TreeNode(10, leftExp, rightExp);

		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeIterative, expectedNode));
	}

	@Test
	public void invertTreeRecursion_Single_Root()
	{
//	actual:		10			expected:	10
		TreeNode actualNodeRecursion = _treeInvertSolution.invertTreeRecursion(new TreeNode(10));
		Assert.assertTrue(actualNodeRecursion.left == null);
		Assert.assertTrue(actualNodeRecursion.right == null);
		Assert.assertTrue(actualNodeRecursion.value == 10);
	}

	@Test
	public void invertTreeIterative_Single_Root()
	{
//	actual:		10			expected:	10
		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(new TreeNode(10));
		Assert.assertTrue(actualNodeIterative.left == null);
		Assert.assertTrue(actualNodeIterative.right == null);
		Assert.assertTrue(actualNodeIterative.value == 10);
	}

	@Test
	public void invertTree_Null()
	{
		Assert.assertTrue(_treeInvertSolution.invertTreeRecursion(null) == null);
		Assert.assertTrue(_treeInvertSolution.invertTreeIterative(null) == null);
	}

	@Test
	public void invertTreeRecursion_2_Level()
	{
//	actual:		10			expected:	10
//				/\						/\
//			20		50				50		20
		TreeNode root = new TreeNode(10, new TreeNode(20), new TreeNode(50));
		TreeNode expectedNode = new TreeNode(10, new TreeNode(50), new TreeNode(20));

		TreeNode actualNodeRecursion = _treeInvertSolution.invertTreeRecursion(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeRecursion, expectedNode));
	}

	@Test
	public void invertTreeIterative_2_Level()
	{
//	actual:		10			expected:	10
//				/\						/\
//			20		50				50		20
		TreeNode root = new TreeNode(10, new TreeNode(20), new TreeNode(50));
		TreeNode expectedNode = new TreeNode(10, new TreeNode(50), new TreeNode(20));
		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeIterative, expectedNode));
	}

	@Test
	public void invertTreeRecursion_3_Level_Only_Right()
	{
//	actual:		10			expected:	10
//				 \						/
//					50				50
//					 \				/
//						40		 40
		TreeNode right = new TreeNode(50, null, new TreeNode(40));
		TreeNode root = new TreeNode(10, null, right);

		TreeNode leftExp = new TreeNode(50, new TreeNode(40), null);
		TreeNode expectedNode = new TreeNode(10, leftExp, null);

		TreeNode actualNodeRecursion = _treeInvertSolution.invertTreeRecursion(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeRecursion, expectedNode));
	}

	@Test
	public void invertTreeIterative_3_Level_Only_Right()
	{
//	actual:		10			expected:	10
//				 \						/
//					50				50
//					 \				/
//						40		 40
		TreeNode right = new TreeNode(50, null, new TreeNode(40));
		TreeNode root = new TreeNode(10, null, right);

		TreeNode leftExp = new TreeNode(50, new TreeNode(40), null);
		TreeNode expectedNode = new TreeNode(10, leftExp, null);

		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeIterative, expectedNode));
	}

	@Test
	public void invertTreeRecursion_3_Level_Only_Left()
	{
//	actual:		10			expected:	10
//				/						 \
//			  25							25
//			/	 							 \
//		  5					 					5
		TreeNode left = new TreeNode(25, new TreeNode(5), null);
		TreeNode root = new TreeNode(10, left, null );

		TreeNode rightExp = new TreeNode(25, null, new TreeNode(5));
		TreeNode expectedNode = new TreeNode(10, null, rightExp);

		TreeNode actualNodeRecursion = _treeInvertSolution.invertTreeRecursion(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeRecursion, expectedNode));
	}

	@Test
	public void invertTreeIterative_3_Level_Only_Left()
	{
//	actual:		10			expected:	10
//				/						 \
//			  25							25
//			/	 							 \
//		  5					 					5
		TreeNode left = new TreeNode(25, new TreeNode(5), null);
		TreeNode root = new TreeNode(10, left, null );

		TreeNode rightExp = new TreeNode(25, null, new TreeNode(5));
		TreeNode expectedNode = new TreeNode(10, null, rightExp);

		TreeNode actualNodeIterative = _treeInvertSolution.invertTreeIterative(root);
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(actualNodeIterative, expectedNode));
	}
}
