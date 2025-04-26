public class SolutionMath {
    public boolean isPowerOfFour(int n) {
        double fourthRoot = Math.pow(n, 1.0 / 4.0);
//        System.out.println(fourthRoot);
        int whole = (int) fourthRoot;
//        System.out.println(whole);
        boolean flag = false;
        if (fourthRoot - whole == 0) {
            flag = true;
        }
        if (n == 0) {
            flag = false;
        }
        return flag;
    }
}
