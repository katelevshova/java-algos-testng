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

	@BeforeMethod
	public void setUp()
	{

	}

	@Test
	public void testLowestCommonAncestor_1()
	{
//				6
//				/\
//			20		80
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

		TreeNode left = new TreeNode(20);
		TreeNode right = new TreeNode(80);
		TreeNode root = new TreeNode(6, left, right);
		TreeNode actualResult = lowestCommonAncestor.lowestCommonAncestor(root, left, right);
		Assert.assertEquals(actualResult.value, root.value);
	}
}