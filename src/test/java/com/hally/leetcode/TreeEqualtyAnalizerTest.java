package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 25.10.2015.
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

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
	}

	@Test
	public void testIsSymmetric_Single_Root()
	{
//				10							10
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(new TreeNode(10),
				new TreeNode(10)));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(new TreeNode(10),
				new TreeNode(10)));
	}

	@Test
	public void testIsSymmetric_Single_Root_Null()
	{
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(null, null));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(null, null));
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

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
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

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
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

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
	}

	@Test
	public void testIsSymmetric_2_Level_Right_Tree()
	{
//				10					10
//				 \					 \
//				 15					  15
		TreeNode root1 = new TreeNode(10, null, new TreeNode(15));
		TreeNode root2 = new TreeNode(10, null, new TreeNode(15));

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
	}

	@Test
	public void testIsSymmetric_3_Level_Tree_False()
	{
//				10							10
//				/\							/\
//			15		20					15		20
// 			/\		/\					/\		/\
//		  30  40  70  80			30	  40  33  80
		TreeNode leftNode = new TreeNode(15, new TreeNode(30), new TreeNode(40));
		TreeNode rightNode1 = new TreeNode(20, new TreeNode(70), new TreeNode(80));
		TreeNode root1 = new TreeNode(10, leftNode, rightNode1);
		TreeNode rightNode2 = new TreeNode(20, new TreeNode(33), new TreeNode(80));
		TreeNode root2 = new TreeNode(10, leftNode, rightNode2);

		Assert.assertFalse(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertFalse(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
	}

	@Test
	public void testIsSymmetric_2_Level_Left_Tree_False()
	{
//				10					10
//				/					/\
//			15					15		20
		TreeNode leftNode = new TreeNode(15);
		TreeNode root1 = new TreeNode(10, leftNode, null);
		TreeNode root2 = new TreeNode(10, leftNode, new TreeNode(20));

		Assert.assertFalse(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertFalse(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
	}

	@Test
	public void testIsSymmetric_Single_Root_False()
	{
		Assert.assertFalse(_treeEqualtyAnalyzer.isSameTreeRecursion(null, new TreeNode(5)));
		Assert.assertFalse(_treeEqualtyAnalyzer.isSameTreeIterative(null, new TreeNode(5)));
	}

	@Test
	public void testIsSymmetric_3_Level_Right_Tree_False()
	{
//				10							10
//				/\							/\
//			15		20					15		20
// 					/\							/
//		         35  65				     	 35
		TreeNode leftNode = new TreeNode(15);
		TreeNode rightNode = new TreeNode(20, new TreeNode(35), new TreeNode(65));
		TreeNode root1 = new TreeNode(10, leftNode, rightNode);
		TreeNode root2 = new TreeNode(10, leftNode, rightNode);

		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeRecursion(root1, root2));
		Assert.assertTrue(_treeEqualtyAnalyzer.isSameTreeIterative(root1, root2));
	}

}
