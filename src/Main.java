import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//    System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
//    solution.isPalindrome(3);
//    System.out.println(solution.isPalindrome(12000021));
//        System.out.println(solution.isValid("()[]{}"));
//        System.out.println(solution.strStr("Hello world!", "world"));
//        solution.plusOne(new int[]{2, 7, 11, 15});
//        solution.searchRange(new int[]{5,7,7,8,8,10}, 8);
        char[][] sudokuGrid = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solution.isValidSudoku(sudokuGrid);
    }
}