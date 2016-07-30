package com.opentable.code.sample;

import java.util.Arrays;
import java.util.List;

public final class App {


    public static void main(String[] args) {

        //Change elements in intervals array to test a different dataset.
        Interval[] intervals = {new Interval(10, 11), new Interval(11, 13), new Interval(13, 15), new Interval(4, 1), new Interval(5, 1), new Interval(2, 3), new Interval(1, 2), new Interval(3, 5)};
        List<Interval> result = Intervals.merge(Arrays.asList(intervals));
        System.out.println("Merged intervals: " + result);

    }
}
