package com.hally.taskAp;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class TreeSymmetryAnalizer
{
	/**
	 * Checks if the Tree is symmetric
	 * @param parent
	 * @return true - if symmetric, false - if is not
	 */
	public Boolean isSymmetric(Node parent)
	{
		if (parent == null)
		{
			return true;
		}

		return isSymmetricHelper(parent.left, parent.right);
	}

	/**
	 * A helper method for <code>isSymmetric</code> method. Checks internal nodes.
	 * @param leftNode
	 * @param rightNode
	 * @return
	 */
	private Boolean isSymmetricHelper(Node leftNode, Node rightNode)
	{
		Boolean result = false;

		// If both null then true
		if (leftNode == null && rightNode == null)
		{
			result = true;
		}

		if (leftNode != null && rightNode != null)
		{
			result = (leftNode.value == rightNode.value)
					&& isSymmetricHelper(leftNode.left, rightNode.right)
					&& isSymmetricHelper(leftNode.right, rightNode.left);
		}

		return  result;
	}
}
