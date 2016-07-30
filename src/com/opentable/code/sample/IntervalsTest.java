package com.opentable.code.sample;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by pjajara on 7/30/16.
 */
public class IntervalsTest {

    @Test
    public void testWithNullIntervals() {
        Assert.assertNotNull(Intervals.merge(null));
        Assert.assertNotNull(Intervals.merge(new ArrayList<Interval>()));
        Assert.assertNotNull(Intervals.merge(Arrays.asList(new Interval[]{})));
    }

}
