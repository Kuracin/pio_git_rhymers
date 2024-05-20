package edu.kis.vh.nursery;

public class DefaultRhymer {


    public static final int minusOne = -1;
    public static final int eleven = 11;
    private final int[] NUMBERS = new int[12];
    private int total = -1;
    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }
        protected boolean callCheck() {
            return total == minusOne;
        }
        
            protected boolean isFull() {
                return total == eleven;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return minusOne;
                    return NUMBERS[total];
                }
            
                    protected int countOut() {
                        if (callCheck())
                            return minusOne;
                        return NUMBERS[total--];
                    }
    public int[] getNUMBERS() {
        return NUMBERS;
    }

}
