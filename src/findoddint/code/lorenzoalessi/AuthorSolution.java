package findoddint.code.lorenzoalessi;

public class AuthorSolution {

    public static int findIt(int[] a) {
        for (int i : a) {
            int result = 0;
            for (int j : a) {
                if (j == i)
                    result++;
            }

            if (result % 2 != 0)
                return i;
        }

        return 0;
    }
}
