package deadfishswim.code.lorenzoalessi;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AuthorTest {

    @Test
    public void exampleTest() {
        assertArrayEquals(new int[] {8, 64}, AuthorSolution.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, AuthorSolution.parse("iiisdosodddddiso"));
    }
}
