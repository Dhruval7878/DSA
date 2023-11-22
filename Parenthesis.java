import java.util.*;

public class Parenthesis {
    public static List<String> AllParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }

    private static void backtrack(String current, int openCount, int closeCount, int maxCount, List<String> result) {
        if (current.length() == 2 * maxCount) {
            result.add(current);
            return;
        }

        if (openCount < maxCount) {
            backtrack(current + '(', openCount + 1, closeCount, maxCount, result);
        }

        if (closeCount < openCount) {
            backtrack(current + ')', openCount, closeCount + 1, maxCount, result);
        }
    }
}