/*
 * [Tests Java language and prob solving] Write a Java method testForSum which determines whether a given array of integers contains three entries whose sum is equal to a given integer. Assume the following:

    a. The method accepts an array intArr of int’s and an int testInt as its two arguments
    b. The return type of the method is boolean
    c. The method returns true if and only if there are distinct integers i, j, k such that intArr[i] + intArr[j] + intArr[k] equals testInt.

    Test your method in a main method, which passes the following input values
    {5, 1, 23, 21, 17, 2, 3, 9, 12}, 22
    into the method testForSum, and which outputs the return value to the console.
 */
class TestForSum {
    public static boolean testForSum(int[] intArr, int testInt) {
        int i, j, k;
        boolean flag = false;

        for (i = 0; i < intArr.length; i++) {
            for (j = i + 1; j < intArr.length; j++) {
                for (k = j + 1; k < intArr.length; k++) {
                    if (i + j + k == testInt) {
                        flag = true;
                        break;
                    }
                }
            }
        }

        return flag;
    }
}