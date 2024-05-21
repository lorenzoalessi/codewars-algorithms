package facebooklikesystem.code.lorenzoalessi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", AuthorSolution.whoLikesIt());
        assertEquals("Peter likes this", AuthorSolution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", AuthorSolution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", AuthorSolution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", AuthorSolution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
