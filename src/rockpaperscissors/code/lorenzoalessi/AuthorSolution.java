package rockpaperscissors.code.lorenzoalessi;

public class AuthorSolution {

    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String P1WON = "Player 1 won!";
    private static final String P2WON = "Player 2 won!";


    public static String rps(String p1, String p2) {
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();

        if (p1.equals(p2)) return "Draw!";

        return switch (p1) {
            case ROCK -> {
                if (p2.equals(PAPER))
                    yield P2WON;
                yield P1WON;
            }
            case PAPER -> {
                if (p2.equals(ROCK))
                    yield P1WON;
                yield P2WON;
            }
            case SCISSORS -> {
                if (p2.equals(ROCK))
                    yield P2WON;
                yield P1WON;
            }
            default -> throw new IllegalArgumentException("Invalid input string.");
        };
    }
}
