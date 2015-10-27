package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Oni on 25.10.2015.
 */
public class TreeEqualtyAnalizerTest
{
	private TreeEqualtyAnalyzer _treeEqualtyAnalyzer;

	@BeforeSuite(alwaysRun = true)
	public void setUp()
	{
		_treeEqualtyAnalyzer = new TreeEqualtyAnalyzer();
	}

	@Test
	public void testIsSymmetric_3_Level_Tree()
	{
//				10							10
//				/\							/\
//			15		20					15		20
// 			/\		/\					/\		/\
//		  30  40  70  80			30	  40  70  80
		TreeNode leftNode = new TreeNode(15, new TreeNode(30), new TreeNode(40));
		TreeNode rightNode = new TreeNode(20, new TreeNode(70), new TreeNode(80));
		TreeNode root1 = new TreeNode(10, leftNode, rightNode);
		TreeNode root2 = new TreeNode(10, leftNode, rightNode);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTree(root1, root2));
	}

	@Test
	public void testIsSymmetric_Single_Root()
	{
//				10							10
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTree(new TreeNode(10), new TreeNode(10)));
	}

	@Test
	public void testIsSymmetric_3_Level_Left_Tree()
	{
//				10							10
//				/\							/\
//			15		20					15		20
// 			/\							/\
//		  30  40  					30	  40
		TreeNode leftNode = new TreeNode(15, new TreeNode(30), new TreeNode(40));
		TreeNode rightNode = new TreeNode(20);
		TreeNode root1 = new TreeNode(10, leftNode, rightNode);
		TreeNode root2 = new TreeNode(10, leftNode, rightNode);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTree(root1, root2));
	}

	@Test
	public void testIsSymmetric_3_Level_Right_Tree()
	{
//				10							10
//				/\							/\
//			15		20					15		20
// 					/\							/\
//		         35  65				     	 35   65
		TreeNode leftNode = new TreeNode(15);
		TreeNode rightNode = new TreeNode(20, new TreeNode(35), new TreeNode(65));
		TreeNode root1 = new TreeNode(10, leftNode, rightNode);
		TreeNode root2 = new TreeNode(10, leftNode, rightNode);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTree(root1, root2));
	}

	@Test
	public void testIsSymmetric_2_Level_Left_Tree()
	{
//				10					10
//				/					/
//			15					15
		TreeNode leftNode = new TreeNode(15);
		TreeNode root1 = new TreeNode(10, leftNode, null);
		TreeNode root2 = new TreeNode(10, leftNode, null);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTree(root1, root2));
	}
}
