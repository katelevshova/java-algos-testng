package com.hally.taskAp;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class TreeSymmetryAnalyzerTest
{
	private TreeSymmetryAnalyzer _treeSymmetryAnalyzer;
	private TreeNode _root;

	@BeforeSuite(alwaysRun = true)
	public void setUp()
	{
		_treeSymmetryAnalyzer = new TreeSymmetryAnalyzer();
	}

	@Test
	public void testIsSymmetric_Single_Root_Node()
	{
		_root = new TreeNode(10);
		Assert.assertTrue(_treeSymmetryAnalyzer.isSymmetricRecursion(_root));
		Assert.assertTrue(_treeSymmetryAnalyzer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsSymmetric_Root_and_2_Leaf_Nodes()
	{
//				10
//				/\
//			20		20
		_root = new TreeNode(10, new TreeNode(20), new TreeNode(20));
		Assert.assertTrue(_treeSymmetryAnalyzer.isSymmetricRecursion(_root));
		Assert.assertTrue(_treeSymmetryAnalyzer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsSymmetric_3_Level_Tree()
	{
//				10
//				/\
//			20		20
// 			/\		/\
//		  30  40  40  30
		TreeNode left = new TreeNode(20, new TreeNode(30), new TreeNode(40));
		TreeNode right = new TreeNode(20, new TreeNode(40), new TreeNode(30));
		_root = new TreeNode(10, left, right);
		Assert.assertTrue(_treeSymmetryAnalyzer.isSymmetricRecursion(_root));
		Assert.assertTrue(_treeSymmetryAnalyzer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_1_Left_Child()
	{
//				10
//				/
//			20
// 			/\
//		  30  40
		TreeNode left = new TreeNode(20, new TreeNode(30), new TreeNode(40));
		_root = new TreeNode(10, left, null);
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_1_Right_Child()
	{
//			10
//			  \
//				20
// 				/\
//		  	  30  40
		TreeNode right = new TreeNode(20, new TreeNode(30), new TreeNode(40));
		_root = new TreeNode(10, null, right);
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_2_Leaf_Nodes()
	{
//				10
//				/\
//			20		20
// 			/\		/\
//		  30  40  30  40
		TreeNode left = new TreeNode(20, new TreeNode(30), new TreeNode(40));
		TreeNode right = new TreeNode(20, new TreeNode(30), new TreeNode(40));
		_root = new TreeNode(10, left, right);
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_3_Level_1_Left_Leaf()
	{
//				10
//				/\
//			20		20
// 			/		/\
//		  30      40  30
		TreeNode left = new TreeNode(20, new TreeNode(30), null);
		TreeNode right = new TreeNode(20, new TreeNode(30), new TreeNode(40));
		_root = new TreeNode(10, left, right);
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalyzer.isSymmetricIterative(_root));
	}
}
