package edu.kis.vh.nursery;

public class DefaultRhymer {




    
    public static final int NUMBERS_CAPACITY = 12;
    public static final int DEFAULT_INDEX = -1;
    public int DEFAULT_VALUE = -1;
    private final int[] NUMBERS = new int[NUMBERS_CAPACITY];
  /**
     * Adds a number on top of the stack if it is not full.
     *
     * @param in - number to be added
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++DEFAULT_VALUE] = in;
    }
  /**
     * Checks if the stack is empty.
     *
     * @return false if the stack is full, true otherwise
     */
    public boolean callCheck() {
        return DEFAULT_VALUE == DEFAULT_INDEX;
    }


  /**
     * Checks if the stack is full.
     *
     * @return false if the stack is empty, ture otherwise
     */
        public boolean isFull() {
            return DEFAULT_VALUE == NUMBERS_CAPACITY - 1;
        }
/**
     * Returns the value on top of the stack.
     *
     * @return value at the top of stack - if stack is empty returns -1
     */
            protected int peekaboo() {
                if (callCheck())
                    return DEFAULT_INDEX;
                return NUMBERS[DEFAULT_VALUE];
            }
/**
     * Removes and returns the value at the top of the stack.
     *
     * @return value at the top of stack - if stack is empty returns -1
     */
                        public int countOut() {

                    if (callCheck())
                        return DEFAULT_INDEX;
                    return NUMBERS[DEFAULT_VALUE--];
                }

    
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
