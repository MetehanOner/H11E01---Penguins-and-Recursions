package de.tum.in.ase;

public final class Solution {

    private Solution() {
    }

    /**
     * Calculate the nth value of PenguTwinSequenceF.
     *
     * @param n the element to calculate
     * @return the result of the calculation
     * @throws IllegalArgumentException when n is negative
     */
    public static int penguTwinSeqF(int n) throws IllegalArgumentException {
        // TODO 1.1: Implement penguTwinSeqF --- penguTwinSeqF(n) = n − penguTwinSeqM(penguTwinSeqF(n−1)) if n>0
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return 1;
        }

        return n - penguTwinSeqM(penguTwinSeqF(n - 1));
    }

    /**
     * Calculate the nth value of PenguTwinSequenceM.
     *
     * @param n the element to calculate (the value of things)
     * @return the result of the calculation
     */
    public static int penguTwinSeqM(int n) throws IllegalArgumentException {
        // TODO 1.1: Implement penguTwinSeqM --- n − penguTwinSeqF(penguTwinSeqM(n − 1)) if n>0
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n <= 1) {
            return 0;
        }

        return n - penguTwinSeqF(penguTwinSeqM(n - 1));
    }

    /**
     * Calculate the result of PenguBigSeq.
     *
     * @param n the value of n
     * @param a the value of a
     * @return the result of the calculation
     */
    public static long penguBigSeq(long n, long a) throws IllegalArgumentException {
        // TODO 1.2: Implement penguBigSeq
        return 0;
    }

    /**
     * Calculate the nth value of PenguRecursiveSequence.
     *
     * @param n  the element to calculate
     * @param p0 the value of p0
     * @param p1 the value of p1
     * @param p2 the value of p2
     * @return the result of the calculation
     */
    public static long penguRecursiveSeq(
            long n, long p0, long p1, long p2
    ) {
        // TODO 1.3: Implement penguRecursiveSeq
        return 0;
    }
}
