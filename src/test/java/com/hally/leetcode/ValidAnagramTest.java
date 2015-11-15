package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 14.11.2015.
 */
public class ValidAnagramTest
{

	@Test
	public void testIsAnagram_True()
	{
		ValidAnagram validAnagram = new ValidAnagram();
		Assert.assertTrue(validAnagram.isAnagram("anagram", "nagrama"));
		Assert.assertTrue(validAnagram.isAnagram("anagram*", "grama*na"));
		Assert.assertTrue(validAnagram.isAnagram("4anagram*", "gr4ama*na"));
	}

	@Test
	public void testIsAnagram_False()
	{
		ValidAnagram validAnagram = new ValidAnagram();
		Assert.assertFalse(validAnagram.isAnagram("an", "nagrama"));
		Assert.assertFalse(validAnagram.isAnagram("anagram", ""));
		Assert.assertFalse(validAnagram.isAnagram("anagram", "anagram!"));
		Assert.assertFalse(validAnagram.isAnagram("anagram", "asdfghj"));
	}

	@Test
	public void testIsAnagramBestSolution_True()
	{
		ValidAnagram validAnagram = new ValidAnagram();
		Assert.assertTrue(validAnagram.isAnagramBestSolution("anagram", "nagrama"));
		Assert.assertTrue(validAnagram.isAnagramBestSolution("anagram*", "grama*na"));
		Assert.assertTrue(validAnagram.isAnagramBestSolution("4anagram*", "gr4ama*na"));
	}

	@Test
	public void testIsAnagramBestSolution_False()
	{
		ValidAnagram validAnagram = new ValidAnagram();
		Assert.assertFalse(validAnagram.isAnagramBestSolution("an", "nagrama"));
		Assert.assertFalse(validAnagram.isAnagramBestSolution("anagram", ""));
		Assert.assertFalse(validAnagram.isAnagramBestSolution("anagram", "anagram!"));
		Assert.assertFalse(validAnagram.isAnagramBestSolution("anagram", "asdfghj"));
	}
}