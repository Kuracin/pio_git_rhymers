package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultRhymer {

    private int totalRejected = 0;

    protected int printRejectedReports() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
    public int getTotalRejected() {
        return totalRejected;
    }
}
