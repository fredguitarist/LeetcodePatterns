class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        int i = 0;
        int j = 1;
        while (i < nums.length - 1) {
            while (j <= nums.length - 1) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                array[0] = i;
                array[1] = j;
                }
            j++;
            }
        i++;
        j = i + 1;
        }
        return array;
    }

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int j = 0;
        boolean bool=false;
        if (str.length() == 1) {
             bool = true; }
        else {
                 for (int i = 0; i < str.length() / 2; i++) {
                     if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                     {break;}
                     j+=1;
                     }
                 }
        if (j == str.length()/2)
            {bool = true;}
    return bool;
    }

//    public boolean isValid(String str) {
//        boolean flag = true;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if ((str.charAt(i) == '(' && str.charAt(i + 1) == ')') || (str.charAt(i) == '[' && str.charAt(i + 1) == ']') || (str.charAt(i) == '{' && str.charAt(i + 1) == '}')) {
//                flag = true;
//            } else {
//                flag = false;
//            }
//        }
//
//        return flag;
//        }
    }