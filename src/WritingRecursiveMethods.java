
/* Rules of Recursion
  A recursive method must have a base case (stopping condition)
  A recursive method must call (invoke) itself
  A recursive method must approach the base case
 */

public class WritingRecursiveMethods {

    /**
     * Write a recursive method called powerN, that takes an
     * integer, base, as a parameter and an integer, exponent, and returns the
     * calculated power: base^exponent.
     * If a base or exponent is passed that is < 1,
     * throw an IllegalArgumentException.
     *
     * @param base     integer base number
     * @param exponent integer exponent number
     * @return
     */
    public static int powerN(int base, int exponent) {

        if (base < 1) {
            throw new IllegalArgumentException(base + " is < 1");
        }
        if (exponent < 1) {
            throw new IllegalArgumentException(exponent + " is < 1");
        }

        // base case
        if (exponent == 1) {
            return base;
        }

        // recursively call the exponent until it approaches base case
        else {
            return base * powerN(base, exponent-1);
        }
    }

    /**
     * Suppose we have a number of bunnies and each bunny has two floppy ears.
     * Write a recursive method that computes the total number of ears for the number
     * of bunnies that are passed in as an integer parameter, int numBunnies
     * <p>
     * If numBunnies < 0, throw an IllegalArgumentException
     *
     * @param numBunnies number of bunnies to calculate the number of ears for
     * @return total number of ears on the bunnies
     */
    public static int bunnyEars(int numBunnies) {
        if (numBunnies < 0) {
            throw new IllegalArgumentException(numBunnies + " is < 0");
        }

        // base case
        if (numBunnies == 0) {
            return 0;
        }

        // recursively call until there are no more bunnies to count (the base case)
        else {
            return 2 + bunnyEars(numBunnies-1);
        }
    }

    /**
     * Given a non-negative int number, return the sum of its digits recursively.
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12)
     * and makes the number SMALLER.
     * <p>
     * if number < 0, throw an IllegalArgumentException.
     *
     * @param number a non-negative integer
     * @return the sum of the digits in number
     */
    public static int sumDigits(int number) {
        return 0;

    }


    /**
     * Write a method starString that accepts an integer parameter n and returns a
     * string of stars(*) 2^n long
     * <p>
     * Example: Returns
     * starString(0) "*" 2^0=1  the base case
     * starString(1) "**" 2^1=2 which is starString(0) + starString(0)
     * starString(2) "****" 2^2=4 which is starString(1) + starString(1)
     * starString(3) "********" 2^3=8 which is starString(2) + starString(2)
     * starString(4) "****************" 2^4=16 which is starString(3) + starString(3)
     *
     * @param n exponent use to calculate number of asterisks to return (2^n)
     * @return string of asterisks
     * <p>
     * if n < 0 throw an IllegalArgumentException
     * <p>
     * Note: This is not an efficient way to solve this problem as we continually solve overlapping subproblems
     */
    public static String starString(int n) {
        return "";
    }


    /*
     TODO: Suppose we now have n bunnies standing in a line, numbered 1, 2, 3, ... , bunnyIndex.
     The odd bunnies (1, 3, 5, 7, ...) have the normal 2 ears.
     The even bunnies (2, 4, 6, 8, ...)will have 3 ears due to a genetic mutation experiment.
     Recursively return the total number of "ears" in the bunny line 1, 2, 3, ... bunnyIndex

     Note: bunnyIndex will start at 1 NOT 0

     if bunnyIndex < 1, throw an IllegalArgumentException.
 */
    public static int crazyBunnyEars(int bunnyIndex) {
        if (bunnyIndex < 1) {
            throw new IllegalArgumentException(bunnyIndex + " is < 1");
        }

        if (bunnyIndex == 1) {
            return 2;
        }

        else {
            if (bunnyIndex % 2 == 0) {
                return 3 + crazyBunnyEars(bunnyIndex-1);
            }
            else if (bunnyIndex % 2 == 1) {
                return 2 + crazyBunnyEars(bunnyIndex-1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("powerN(3,1) = " + powerN(3, 1)); // 3
        System.out.println("powerN(3,2) = " + powerN(3, 2)); // 9
        System.out.println("powerN(3,3) = " + powerN(3, 3)); // 27

        System.out.println();

        System.out.println("crazyBunnyEars(1) = " + crazyBunnyEars(1));        // 2
        System.out.println("crazyBunnyEars(2) = " + crazyBunnyEars(2));       // 5
        System.out.println("crazyBunnyEars(3) = " + crazyBunnyEars(3));       // 7
        System.out.println("crazyBunnyEars(4) = " + crazyBunnyEars(4));       // 10

        System.out.println();

        System.out.println("sumDigits(126) = " + sumDigits(126));            // 9
        System.out.println("sumDigits(49) = " + sumDigits(49));              // 13
        System.out.println("sumDigits(12) = " + sumDigits(12));              // 3

        System.out.println();

        System.out.println("starString(0) = " + starString(0));            // *
        System.out.println("starString(1) = " + starString(1));            // **
        System.out.println("starString(2) = " + starString(2));            // ****
        System.out.println("starString(3) = " + starString(3));            // ********
        System.out.println("starString(4) = " + starString(4));            // ****************

        System.out.println();

        System.out.println("bunnyEars(0) = " + bunnyEars(0));       // 0
        System.out.println("bunnyEars(1) = " + bunnyEars(1));       // 2
        System.out.println("bunnyEars(2) = " + bunnyEars(2));       // 4
        System.out.println("bunnyEars(3) = " + bunnyEars(3));       // 6
        
    }

}