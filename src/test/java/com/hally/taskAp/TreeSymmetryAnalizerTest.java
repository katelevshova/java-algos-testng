package com.hally.taskAp;

import org.testng.Assert;
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

	@Test(alwaysRun = true)
	public void setUp()
	{
		_treeSymmetryAnalizer = new TreeSymmetryAnalizer();
	}

	@Test
	public void testIsSymmetric_Single_Root_Node()
	{
		_root = new Node(10);
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetric(_root));
	}

	@Test
	public void testIsSymmetric_Root_and_2_Leaf_Nodes()
	{
		_root = new Node(10, new Node(20), new Node(20));
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetric(_root));
	}

	@Test
	public void testIsSymmetric_3_Level_Tree()
	{
		Node left = new Node(20, new Node(30), new Node(40));
		Node right = new Node(20, new Node(40), new Node(30));
		_root = new Node(10, left, right);
		Assert.assertTrue(_treeSymmetryAnalizer.isSymmetric(_root));
	}

	@Test
	public void testIsNotSymmetric_1_Left_Child()
	{
		Node left = new Node(20, new Node(30), new Node(40));
		_root = new Node(10, left, null);
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetric(_root));
	}

	@Test
	public void testIsNotSymmetric_1_Right_Child()
	{
		Node right = new Node(20, new Node(30), new Node(40));
		_root = new Node(10, null, right);
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetric(_root));
	}

	@Test
	public void testIsNotSymmetric_2_Leaf_Nodes()
	{
		Node left = new Node(20, new Node(30), new Node(40));
		Node right = new Node(20, new Node(30), new Node(40));
		_root = new Node(10, left, right);
		Assert.assertFalse(_treeSymmetryAnalizer.isSymmetric(_root));
	}
}
