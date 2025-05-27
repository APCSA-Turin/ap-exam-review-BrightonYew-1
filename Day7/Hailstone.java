public class Hailstone {
    /**
     Returns the length of a hailstone sequence that starts with n as described in part (a).
     Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
		int length = 1;
        while (n > 1) {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = n * 3 + 1;
        }
        length++;
        }
    return length;

    }

    /**
     Returns true if the hailstone sequence that starts with n is considered long and false otherwise, as described in part (b).
     Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
		int length = hailstoneLength(n);
if (length > n) {
	return true;
} else {
	return false;
}

    }

    /** Returns the proportion of the first n hailstone sequences
     that are considered long, as described in part (c).
     Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
		int longCount = 0;
for (int i = 1; i <= n; i++) {
	if (isLongSeq(i)) {
    	longCount++;
    }
}
return (double)longCount / n;

    }
}

