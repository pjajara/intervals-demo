package com.opentable.code.sample;

import java.util.Comparator;

/**
 * Created by pjajara on 7/30/16.
 */
public final class IntervalComparator implements Comparator<Interval> {

    @Override
    public int compare(Interval o1, Interval o2) {

        if (o1.getStart() != o2.getStart()) {
            return o1.getStart() - o2.getStart();
        } else {
            return o1.getEnd() - o2.getEnd();
        }
    }
}
