package com.hally.taskAp;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class TreeSymmetryAnalizerTest
{
	private TreeSymmetryAnalizer _treeSymmetryAnalizer;
	private Node _root;

	@BeforeSuite(alwaysRun = true)
	public void setUp()
	{
		_treeSymmetryAnalizer = new TreeSymmetryAnalizer();
	}

	@Test
	public void testIsSymmetric_Single_Root_Node()
	{
		_root = new Node(10);
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetricRecursion(_root));
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsSymmetric_Root_and_2_Leaf_Nodes()
	{
//				10
//				/\
//			20		20
		_root = new Node(10, new Node(20), new Node(20));
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetricRecursion(_root));
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsSymmetric_3_Level_Tree()
	{
//				10
//				/\
//			20		20
// 			/\		/\
//		  30  40  40  30
		Node left = new Node(20, new Node(30), new Node(40));
		Node right = new Node(20, new Node(40), new Node(30));
		_root = new Node(10, left, right);
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetricRecursion(_root));
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_1_Left_Child()
	{
//				10
//				/
//			20
// 			/\
//		  30  40
		Node left = new Node(20, new Node(30), new Node(40));
		_root = new Node(10, left, null);
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_1_Right_Child()
	{
//			10
//			  \
//				20
// 				/\
//		  	  30  40
		Node right = new Node(20, new Node(30), new Node(40));
		_root = new Node(10, null, right);
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_2_Leaf_Nodes()
	{
//				10
//				/\
//			20		20
// 			/\		/\
//		  30  40  30  40
		Node left = new Node(20, new Node(30), new Node(40));
		Node right = new Node(20, new Node(30), new Node(40));
		_root = new Node(10, left, right);
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricIterative(_root));
	}

	@Test
	public void testIsNotSymmetric_3_Level_1_Left_Leaf()
	{
//				10
//				/\
//			20		20
// 			/		/\
//		  30      40  30
		Node left = new Node(20, new Node(30), null);
		Node right = new Node(20, new Node(30), new Node(40));
		_root = new Node(10, left, right);
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricRecursion(_root));
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetricIterative(_root));
	}
}
