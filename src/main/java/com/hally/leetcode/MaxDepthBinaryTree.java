package com.hally.leetcode;

import com.hally.taskAp.Node;

import java.util.LinkedList;

/**
 * Created by Oni on 21.10.2015.
 */
public class MaxDepthBinaryTree
{
	/**
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 */

	public int maxDepth(Node node)
	{
		if(node == null)
		{
			return 0;
		}

		int leftCounter = 0;
		int rightCounter = 0;

		//count left nodes
		if(node.left != null)
		{
			leftCounter = maxDepth(node.left);
		}

		//count right nodes
		if(node.right != null)
		{
			rightCounter = maxDepth(node.right);
		}
		//the largest counter add to 1st root node

		return 1 + Math.max(leftCounter, rightCounter);
	}

	public int maxDepthIterative(Node node)
	{
		if(node == null)
		{
			return 0;
		}

		LinkedList<Node> linkedList = new LinkedList<>();
		linkedList.push(node); // push root
		int nodeCounter = 0;
		int resultCounter = 0;

		while (true)
		{
			// indicates nodes number at current layer
			nodeCounter = linkedList.size();

			if(nodeCounter == 0)
			{
				return resultCounter;
			}

			resultCounter++;

			// dequeue all nodes from current level and enqueue all nodes for next level
			while (nodeCounter > 0)
			{
				node = linkedList.getFirst();
				linkedList.pop();

				if(node.left != null)
				{
					linkedList.push(node.left);
				}

				if(node.right != null)
				{
					linkedList.push(node.right);
				}

				nodeCounter--;
			}
		}
	}
}
