package cursor.hw6.util;

import java.util.Collection;

public class SimilarElementsChecker {

    public static boolean checkSimilarElements(Collection<Integer> src1, Collection<Integer> src2) {
        for (int value : src1) {
            return src2.contains(value);
        }
        return false;
    }
}
