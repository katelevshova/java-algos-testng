package com.hally.leetcode;

import com.hally.taskAp.TreeNode;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 28.10.2015.
 */
public class LowestCommonAncestorTest
{
	@Test
	public void testLowestCommonAncestor_Root_1_Layer()
	{
//				6
//				/\
//			2		8
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(8);
		TreeNode root = new TreeNode(6, left, right);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, left, right);
		Assert.assertEquals(actualResult.value, root.value);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, left, right);
		Assert.assertEquals(actualResultMath.value, root.value);

		TreeNode actualResultIterative= lowestCommonAncestor.lowestCommonAncestorIterative(root,
				left,
				right);
		Assert.assertEquals(actualResultIterative.value, root.value);
	}

	@Test
	public void testLowestCommonAncestor_Left()
	{
//				  	6
//				/		\
//			  2		  	 8
//			/	\		 /\
//		  0		 4		7	9
//				/  \
//			  3		5
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode node_4 =  new TreeNode(4, new TreeNode(3), new TreeNode(5));
		TreeNode left = new TreeNode(2, new TreeNode(0), node_4);
		TreeNode right = new TreeNode(8, new TreeNode(7), new TreeNode(9));
		TreeNode root = new TreeNode(6, left, right);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, left, node_4);
		Assert.assertEquals(actualResult.value, 2);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, left, node_4);
		Assert.assertEquals(actualResultMath.value, 2);

		TreeNode actualResultIterative = lowestCommonAncestor.lowestCommonAncestorIterative(root,
				left, node_4);
		Assert.assertEquals(actualResultIterative.value, 2);
	}

	@Test
	public void testLowestCommonAncestor_Right()
	{
//				  	6
//				/		\
//			  2		  	 8
//			/	\		 /\
//		  0		 4		7	9
//				/  \
//			  3		5
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode node_4 =  new TreeNode(4, new TreeNode(3), new TreeNode(5));
		TreeNode left = new TreeNode(2, new TreeNode(0), node_4);
		TreeNode right = new TreeNode(8, new TreeNode(7), new TreeNode(9));
		TreeNode root = new TreeNode(6, left, right);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, new TreeNode(7),  new TreeNode(9));
		Assert.assertEquals(actualResult.value, 8);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, new TreeNode(7),  new TreeNode(9));
		Assert.assertEquals(actualResultMath.value, 8);

		TreeNode actualResultIterative = lowestCommonAncestor.lowestCommonAncestorIterative(root,
				new
						TreeNode(7), new TreeNode(9));
		Assert.assertEquals(actualResultIterative.value, 8);
	}

	@Test
	public void testLowestCommonAncestor_Root_4_Layers()
	{
//				  	6
//				/		\
//			  2		  	 8
//			/	\		 /\
//		  0		 4		7	9
//				/  \
//			  3		5
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode node_4 =  new TreeNode(4, new TreeNode(3), new TreeNode(5));
		TreeNode left = new TreeNode(2, new TreeNode(0), node_4);
		TreeNode right = new TreeNode(8, new TreeNode(7), new TreeNode(9));
		TreeNode root = new TreeNode(6, left, right);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, new TreeNode(3),
				new TreeNode(7));
		Assert.assertEquals(actualResult.value, 6);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, new TreeNode
						(3), new TreeNode(7));
		Assert.assertEquals(actualResultMath.value, 6);

		TreeNode actualResultIterative = lowestCommonAncestor.lowestCommonAncestorIterative(root,
				new
						TreeNode(3), new TreeNode(7));
		Assert.assertEquals(actualResultIterative.value, 6);
	}

	@Test
	public void testLowestCommonAncestor_LeftSide()
	{
//				  	6
//				/
//			  2
//			/	\
//		  0		 4
//				/  \
//			  3		5
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode node_4 =  new TreeNode(4, new TreeNode(3), new TreeNode(5));
		TreeNode left = new TreeNode(2, new TreeNode(0), node_4);
		TreeNode root = new TreeNode(6, left, null);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, new TreeNode(3),
				new TreeNode(4));
		Assert.assertEquals(actualResult.value, 4);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, new TreeNode
				(3), new TreeNode(4));
		Assert.assertEquals(actualResultMath.value, 4);

		TreeNode actualResultIterative = lowestCommonAncestor.lowestCommonAncestorIterative(root,
				new TreeNode(3), new TreeNode(4));
		Assert.assertEquals(actualResultIterative.value, 4);
	}

	@Test
	public void testLowestCommonAncestor_Null_Second()
	{
//				  	6
//				/
//			  2
//			/	\
//		  0		 4
//				/  \
//			  3		5
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode node_4 =  new TreeNode(4, new TreeNode(3), new TreeNode(5));
		TreeNode left = new TreeNode(2, new TreeNode(0), node_4);
		TreeNode root = new TreeNode(6, left, null);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, new TreeNode(3),
				null);
		Assert.assertEquals(actualResult.value, 3);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, new TreeNode
				(3), null);
		Assert.assertEquals(actualResultMath.value, 3);

		TreeNode actualResultIterative = lowestCommonAncestor.lowestCommonAncestorIterative(root,
				new TreeNode(3), null);
		Assert.assertEquals(actualResultIterative.value, 3);
	}

	@Test
	public void testLowestCommonAncestor_Null_First()
	{
//				  	6
//				/
//			  2
//			/	\
//		  0		 4
//				/  \
//			  3		5
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode node_4 =  new TreeNode(4, new TreeNode(3), new TreeNode(5));
		TreeNode left = new TreeNode(2, new TreeNode(0), node_4);
		TreeNode root = new TreeNode(6, left, null);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, null,
				new TreeNode(3));
		Assert.assertEquals(actualResult.value, 3);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, null, new TreeNode(3));
		Assert.assertEquals(actualResultMath.value, 3);

		TreeNode actualResultIterative = lowestCommonAncestor.lowestCommonAncestorIterative(root,
				null, new TreeNode(3));
		Assert.assertEquals(actualResultIterative.value, 3);
	}

	@Test
	public void testLowestCommonAncestor_Null_Both()
	{
//				  	6
//				/
//			  2
//			/	\
//		  0		 4
//				/  \
//			  3		5
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode node_4 =  new TreeNode(4, new TreeNode(3), new TreeNode(5));
		TreeNode left = new TreeNode(2, new TreeNode(0), node_4);
		TreeNode root = new TreeNode(6, left, null);

		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, null, null);
		Assert.assertEquals(actualResult.value, root.value);

		TreeNode actualResultMath = lowestCommonAncestor.lowestCommonAncestorMath(root, null, null);
		Assert.assertEquals(actualResultMath.value, root.value);

		TreeNode actualResultIterative = lowestCommonAncestor.lowestCommonAncestorIterative(root,
				null, null);
		Assert.assertEquals(actualResultIterative.value, root.value);
	}
}