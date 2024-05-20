package deadfishswim.code.lorenzoalessi;

import java.util.ArrayList;
import java.util.List;

public class AuthorSolution {

    public static int[] parse(String data) {
        List<Integer> result = new ArrayList<>();
        int index = 0;

        char[] charArray = data.toCharArray();

        for (char singleChar : charArray) {
            switch (singleChar) {
                case 'i':
                    index++;
                    break;
                case 'd':
                    index--;
                    break;
                case 's':
                    index = index * index;
                    break;
                case 'o':
                    result.add(index);
                    break;
                default:
                    break;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
