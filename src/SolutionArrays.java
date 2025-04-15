import java.util.Arrays;

import static java.util.Arrays.*;

public class SolutionArrays {
    public void moveZeroes(int[] nums) {
        int j = 0; // Указатель на позицию для вставки ненулевого элемента

        // Проходим через массив
        for (int i = 0; i < nums.length; i++) {
            // Если текущий элемент не ноль, перемещаем его на позицию j
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
                System.out.println(Arrays.toString(nums));
            }
        }

        // Заполняем оставшиеся позиции нулями
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

        // Для отладки выводим массив после обработки
        System.out.println(Arrays.toString(nums));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;               // Левый указатель
        int right = nums.length - 1; // Правый указатель

        while (left <= right) {
            int mid = left + (right - left) / 2; // Находим середину

            if (nums[mid] == target) { // Если целевое значение найдено
                return mid;            // Возвращаем индекс
            } else if (nums[mid] < target) { // Если текущее значение меньше целевого
                left = mid + 1;        // Ищем в правой части
            } else {                    // Если текущее значение больше целевого
                right = mid - 1;       // Ищем в левой части
            }
        }

        // Если целевое значение не найдено, возвращаем индекс, куда оно должно быть вставлено
        return left;
    }
}
