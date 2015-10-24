package com.hally.taskAp;

import java.util.LinkedList;
import java.util.Queue;

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
	public Boolean isSymmetricRecursion(Node parent)
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

	public Boolean isSymmetricIterative(Node node)
	{
		Boolean result = true;

		if(node == null)
		{
			return false;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.offer(node.left);
		queue.offer(node.right);

		while (!queue.isEmpty())
		{
			Node leftNode = queue.poll();
			Node rightNode = queue.poll();

			if(leftNode == null && rightNode == null)
			{
				result = true;
			}
			else if (leftNode == null || rightNode == null || leftNode.value != rightNode.value)
			{
				result = false;
				break;
			}
			else if(leftNode != null && rightNode != null)
			{
				queue.offer(leftNode.left);
				queue.offer(rightNode.right);

				queue.offer(leftNode.right);
				queue.offer(rightNode.left);
			}
		}

		return result;
	}
}
