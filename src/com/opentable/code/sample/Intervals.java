package com.opentable.code.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by pjajara on 7/30/16.
 */
public final class Intervals {

    private Intervals() {
        //No instantiation needed
    }

    public static List<Interval> merge(final List<Interval> intervals) {

        if (intervals == null || intervals.isEmpty()) {
            return Collections.emptyList();
        }
        List<Interval> result = new ArrayList<>(intervals.size());
        Collections.sort(intervals, new IntervalComparator());
        System.out.println("Sorted Intervals: " + intervals);

        //Get first interval from list
        Interval begin = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {

            //current interval from list iteration
            Interval current = intervals.get(i);

            if (begin.overlaps(current)) {
                begin = new Interval(begin.getStart(), Math.max(begin.getEnd(), current.getEnd()));
            } else {
                result.add(begin);
                begin = current;
            }
        }

        result.add(begin);
        return result;
    }
}
