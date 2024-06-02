package edu.kis.vh.nursery;

public class DefaultRhymer {

    private final int[] NUMBERS = new int[12];

    private int total = -1;
    public int getTotal() {
        return total;
    }


    /**
     * Adds a number on top of the stack if it is not full.
     *
     * @param in - number to be added
     */
    protected void countIn(int in) {

        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return false if the stack is full, true otherwise
     */
        protected boolean callCheck() {
            return total == -1;
        }
    /**
     * Checks if the stack is full.
     *
     * @return false if the stack is empty, ture otherwise
     */
            protected boolean isFull() {
                return total == 11;
            }

    /**
     * Returns the value on top of the stack.
     *
     * @return value at the top of stack - if stack is empty returns -1
     */
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return NUMBERS[total];
                }
    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return value at the top of stack - if stack is empty returns -1
     */
                    protected int countOut() {
                        if (callCheck())
                            return -1;
                        return NUMBERS[total--];
                    }

    /**
     * Returns the current stack.
     *
     * @return current stack
     */
    public int[] getNUMBERS() {
        return NUMBERS;
    }

}
