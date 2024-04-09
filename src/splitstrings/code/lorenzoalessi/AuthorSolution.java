package splitstrings.code.lorenzoalessi;

import java.util.ArrayList;
import java.util.List;

public class AuthorSolution {

    public static String[] solution(String s) {
        if (s == null || s.isEmpty()) return new String[0];

        String[] splitted = s.split("");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < splitted.length; i++) {
            if (i % 2 != 0)
                continue;

            result.add(i+1 < splitted.length ? splitted[i] + splitted[i+1] : splitted[i] + "_");
        }

        return result.toArray(String[]::new);
    }
}
