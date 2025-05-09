import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

//    public int strStr(String haystack, String needle) {
//        int index = haystack.indexOf(needle);
//        System.out.println(index);
//        return index;
//        }
//    public int[] plusOne(int[] digits) {
//
//    int[] result = new int[digits.length + 1];
//    int sum = 0;
//
////    System.out.println(digits.length);
//    int i = 0;
//    while (digits.length - 1 >= i) {
////        result[i] = digits[digits.length - 1];
////        digits[i]
////        System.out.println(digits[i]);
////        sum = sum + digits[i] * 10^(digits.length - 1 -i);
//        sum = (int) (sum + digits[i] * Math.pow(10,(digits.length - 1 -i)));
//        i += 1;
//    }
//    System.out.println(sum);
//    return result;
//    }

    public int[] searchRange(int[] nums, int target) {
        int[] emptyArray = new int[2];
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println(i);
                emptyArray[j] = i;
                j += 1;
            }
        }
        System.out.println(Arrays.toString(emptyArray));
        return emptyArray;
    }

    public boolean isValidSudoku(char[][] board) {

//        System.out.println(board[0][0]);
        ArrayList<Integer> list = new ArrayList<>();
        int numRows = board.length; // Количество строк
        int numCols = board[0].length; // Количество столбцов (предполагаем, что все строки имеют одинаковую длину)

        for (int i = 0; i < numRows; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < numCols; j++) {
                char value = board[i][j];
                if (value == '.') {
                    continue; // пропускаем точки
                }
                if (seen.contains(value)) {
                    System.out.println("повтор");
                    return false; // повтор
                }
                seen.add(value);
            }
        }
        System.out.println("все строки уникальны");
        return true; // все строки уникальны
    }
}