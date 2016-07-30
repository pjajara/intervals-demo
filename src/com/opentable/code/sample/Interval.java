package com.opentable.code.sample;

/**
 * Created by pjajara on 7/30/16.
 */
public final class Interval {

    private final int start;
    private final int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean overlaps(final Interval interval) {
        if (this.end < interval.start) return false;
        if (interval.end < this.start) return false;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Interval{");
        sb.append("start=").append(start);
        sb.append(", end=").append(end);
        sb.append('}');
        return sb.toString();
    }

}
