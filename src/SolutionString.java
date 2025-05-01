import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SolutionString {
    public String longestCommonPrefix(String[] strs) { //14

        int index = java.util.stream.IntStream.range(0, strs.length)
                .boxed()
                .min((i, j) -> Integer.compare(strs[i].length(), strs[j].length()))
                .orElse(-1);

        String shortestString = strs[index];
        for (int i = 0; i < shortestString.length(); i++) {
            char c = shortestString.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return shortestString.substring(0, i); // нашли, где префикс закончился
                }
            }
        }
        return shortestString; // если все символы совпали

    }

    public String multiply(String num1, String num2) {
        int i = Integer.parseInt (num1);
        int j = Integer.parseInt (num2);
        String result = Integer.toString(i * j);
        System.out.println(result);
        return result;
    }

    public boolean wordPattern(String pattern, String s) {  //290
        String[] substrings = s.trim().split("\s+");
        if (pattern.length() != substrings.length) {
            return false;
        }
        for (int i = 0; i < substrings.length; i++) {
            for (int j = i + 1; j < substrings.length; j++) {
                if ((substrings[i].equals(substrings[j]))==(pattern.charAt(i) == pattern.charAt(j))) {
                }
                else {
                    return false;
                }
            }
        }
    return true;
    }

    public String reverseVowels(String s) { //345
        StringBuilder vowels = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels.append(ch);
            }
        }
        vowels.reverse();
        StringBuilder modified = new StringBuilder(s);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(s.charAt(i)))) {
                modified.setCharAt(i, vowels.charAt(j));
                j++;
            }
        }
        return modified.toString();
    }

    public int[] plusOne(int[] digits) { //66
        ArrayList<Integer> mylist = new ArrayList<>();
        for (int digit : digits) {
            mylist.add(digit);
        }
        if (mylist.get(mylist.size()-1) != 9) {
            mylist.set(mylist.size() - 1, (mylist.get(mylist.size() - 1)) + 1);}
        else {
            mylist.add(mylist.size()-1, 1);
            mylist.remove(mylist.size() - 1);
            mylist.add(0);
        }
        int[] array = new int[mylist.size()];
        for (int i = 0; i < mylist.size(); i++) {
            array[i] = mylist.get(i); // Преобразование Integer в int
        }
        return array;
    }

    public String reverseOnlyLetters(String s) { //917

        StringBuilder builder = new StringBuilder("");


        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            // if (!Character.isLetter(ch)){
            //     builder.append(ch);
            // }
            if (Character.isLetter(ch)) {
                builder.append(s.charAt(s.length() - 1 - j));
                System.out.println(builder.toString());
            }
            else {
                builder.append(ch);
                System.out.println(builder.toString());
            }
        }
        System.out.println(builder.toString());

        return s;
    }

    public int lengthOfLongestSubstring(String s) { //gpt //"ababc"
        Set<Character> window = new HashSet<>(); 
        int start = 0, end = 0;
        int maxLength = 0;

        while (end < s.length()) {
            char c = s.charAt(end);

            if (!window.contains(c)) {  //
                // Символ новый — добавляем и расширяем окно
                window.add(c);
                maxLength = Math.max(maxLength, end - start + 1); //нахождение большего
                end++;
            } else {
                // Символ уже есть — убираем символ слева и сдвигаем start
                window.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
    //Дана строка s. Найди длину самой длинной подстроки, 
    // которая содержит не более двух различных символов.
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        // реализация здесь
        return 0;
    }
}
