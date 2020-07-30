package com.hally.tree;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WeightedQuickUnionTest
{
    private String _logStr ="\n"+
            "0 1 2015-08-14 18:00:00 \n" +
            "1 9 2015-08-14 18:01:00 \n" +
            "0 2 2015-08-14 18:02:00 \n" +
            "0 3 2015-08-14 18:04:00 \n" +
            "0 4 2015-08-14 18:06:00 \n" +
            "0 5 2015-08-14 18:08:00 \n" +
            "0 6 2015-08-14 18:10:00 \n" +
            "0 7 2015-08-14 18:12:00 \n" +
            "0 8 2015-08-14 18:14:00 \n" +
            "1 2 2015-08-14 18:16:00 \n" +
            "1 3 2015-08-14 18:18:00 \n" +
            "1 4 2015-08-14 18:20:00 \n" +
            "1 5 2015-08-14 18:22:00 \n" +
            "2 1 2015-08-14 18:24:00 \n" +
            "2 3 2015-08-14 18:26:00 \n" +
            "2 4 2015-08-14 18:28:00 \n" +
            "5 5 2015-08-14 18:30:00 \n";

    @Test
    public void testUnion()
    {
        WeightedQuickUnion solution = new WeightedQuickUnion(_logStr);
        Assert.assertEquals(1,1);
        //Assert.assertEquals(solution.union(4, 9));

    }



}

