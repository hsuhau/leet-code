import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 * 
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 * 
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * 
 * 
 * 提示：
 * 
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ["2", "9"] 的一个数字。
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> letters = new HashMap<>() {
            {
                put(2, Arrays.asList("a", "b", "c"));
                put(3, Arrays.asList("d", "e", "f"));
                put(4, Arrays.asList("g", "h", "i"));
                put(5, Arrays.asList("j", "k", "l"));
                put(6, Arrays.asList("m", "n", "o"));
                put(7, Arrays.asList("p", "q", "r", "s"));
                put(8, Arrays.asList("t", "u", "v"));
                put(9, Arrays.asList("w", "x", "y", "z"));
            }
        };
        char[] cs = digits.toCharArray();
        // 入参长度0-4
        int len = digits.length();
        if (len == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < letters.get(Character.getNumericValue(cs[0])).size(); i++) {
            String s1 = letters.get(Character.getNumericValue(cs[0])).get(i);
            if (len == 1) {
                result.add(s1);
                continue;
            }
            for (int j = 0; j < letters.get(Character.getNumericValue(cs[1])).size(); j++) {
                String s2 = letters.get(Character.getNumericValue(cs[1])).get(j);
                String tmp2 = s1.concat(s2);
                if (len == 2) {
                    result.add(tmp2);
                    continue;
                }
                for (int k = 0; k < letters.get(Character.getNumericValue(cs[2])).size(); k++) {
                    String s3 = letters.get(Character.getNumericValue(cs[2])).get(k);
                    String tmp3 = tmp2.concat(s3);
                    if (len == 3) {
                        result.add(tmp3);
                        continue;
                    }
                    for (int l = 0; l < letters.get(Character.getNumericValue(cs[3])).size(); l++) {
                        String s4 = letters.get(Character.getNumericValue(cs[3])).get(l);
                        String tmp4 = tmp3.concat(s4);
                        result.add(tmp4);
                    }
                }
            }
        }

        return result;
    }
}
