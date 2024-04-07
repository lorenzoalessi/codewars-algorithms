package rockpaperscissors.code.lorenzoalessi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", AuthorSolution.rps("rock", "scissors"));
        assertEquals("Player 1 won!", AuthorSolution.rps("scissors", "paper"));
        assertEquals("Player 1 won!", AuthorSolution.rps("paper", "rock"));
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", AuthorSolution.rps("scissors", "rock"));
        assertEquals("Player 2 won!", AuthorSolution.rps("paper", "scissors"));
        assertEquals("Player 2 won!", AuthorSolution.rps("rock", "paper"));
    }

    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", AuthorSolution.rps("scissors", "scissors"));
        assertEquals("Draw!", AuthorSolution.rps("paper", "paper"));
        assertEquals("Draw!", AuthorSolution.rps("rock", "rock"));
    }
}
