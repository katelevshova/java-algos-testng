package com.hally.tree;
import edu.princeton.cs.algs4.StdIn;

public class WeightedQuickUnion
{
    /**
     * Task:
     * Social network connectivity.
     * Given a social network containing N members and a log file
     * containing M timestamps at which times pairs of members formed friendships,
     * design an algorithm to determine the earliest time at which all members are connected
     * (i.e., every member is a friend of a friend of a friend ... of a friend).
     * Assume that the log file is sorted by timestamp and that friendship is an equivalence relation.
     * The running time of your algorithm should be MlogN or better and use extra space proportional to nnn.
     * Example:
     * 0 1 2015-08-14 18:00:00
     * 1 9 2015-08-14 18:01:00
     * 0 2 2015-08-14 18:02:00
     * 0 3 2015-08-14 18:04:00
     * 0 4 2015-08-14 18:06:00
     * 0 5 2015-08-14 18:08:00
     * 0 6 2015-08-14 18:10:00
     * 0 7 2015-08-14 18:12:00
     * 0 8 2015-08-14 18:14:00
     * 1 2 2015-08-14 18:16:00
     * 1 3 2015-08-14 18:18:00
     * 1 4 2015-08-14 18:20:00
     * 1 5 2015-08-14 18:22:00
     * 2 1 2015-08-14 18:24:00
     * 2 3 2015-08-14 18:26:00
     * 2 4 2015-08-14 18:28:00
     * 5 5 2015-08-14 18:30:00
     *
     * Social network can be represented as a tree or graph where each node have 0 to n connections.
     * Main part of data structure which you need is an array of integers, where each element index
     * can be interpreted as social network member ID, and value is ID of another member which is root for first one.
     * You need to read the log and to perform union operation in your data structure on
     * each log record (building the tree) and analyze two criteria
     * each member has a connection (Set<Integer> haveConnection)
     * there is only one global root (because from the beginning you will have a lot of not connected subnetworks
     * with own roots) (Set<Integer> roots)
     * Once both criteria satisfied - all members of your network are connected.
     */

    public void WeightedQuickUnion(String logStr)
    {
       // int n = StdIn.readInt();
    }

}
