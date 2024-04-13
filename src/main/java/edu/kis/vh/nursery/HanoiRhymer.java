package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultRhymer {

    int totalRejected = 0;

    public int printRejectedReports() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
