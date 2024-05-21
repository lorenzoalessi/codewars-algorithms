package facebooklikesystem.code.lorenzoalessi;

public class AuthorSolution {

    private static final String likeThis = " like this";

    public static String whoLikesIt(String... names) {
        if (names == null || names.length == 0)
            return "no one likes this";

        if (names.length == 1)
            return names[0] + " likes this";

        if (names.length == 2)
            return names[0] + " and " + names[1] + likeThis;

        if (names.length == 3)
            return names[0] + ", " + names[1] + " and " + names[2] + likeThis;

        return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others" + likeThis;
    }
}
