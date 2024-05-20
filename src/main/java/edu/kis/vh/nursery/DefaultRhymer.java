package edu.kis.vh.nursery;

public class DefaultRhymer {

    public static final int DEFAULT_INDEX = -1;
    public static final int NUMBERS_CAPACITY = 12;
    private int[] NUMBERS = new int[NUMBERS_CAPACITY];

    public int DEFAULT_VALUE = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++DEFAULT_VALUE] = in;
    }

    public boolean callCheck() {
        return DEFAULT_VALUE == DEFAULT_INDEX;
    }

        public boolean isFull() {
            return DEFAULT_VALUE == NUMBERS_CAPACITY - 1;
        }

            protected int peekaboo() {
                if (callCheck())
                    return DEFAULT_INDEX;
                return NUMBERS[DEFAULT_VALUE];
            }

                public int countOut() {
                    if (callCheck())
                        return DEFAULT_INDEX;
                    return NUMBERS[DEFAULT_VALUE--];
                }

}
