package org.linagora.recursive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RecursiveTest {

    /**
     * The testee.sumNFirstIntegers method should return the sum of the n first integers
     * 
     * 1. Negative parameter should throw an exception (-10 -> IllegalArgumentException)
     * 2. Zero parameter should return zero (0 -> 0)
     * 3. One parameter should return one (1 -> 1)
     * 4. Two parameter should return three (2 -> 3)
     * 5. Ten parameter should return fifty five (10 -> 55)
     * 
     * The solution may be written in less than 15 lines
     */

    private Recursive testee;

    @Before
    public void setup() {
        testee = new Recursive();
    }

    @Test(expected=IllegalArgumentException.class)
    public void sumNFirstIntegersShouldThrowAnExceptionWhenNegativeNumber() {
        testee.sumNFirstIntegers(-10);
    }

    @Test
    public void sumNFirstIntegersShouldReturnZeroWhenZeroNumber() {
        assertThat(testee.sumNFirstIntegers(0)).isEqualTo(0);
    }

    @Test
    public void sumNFirstIntegersShouldReturnOneWhenOneNumber() {
        assertThat(testee.sumNFirstIntegers(1)).isEqualTo(1);
    }

    @Test
    public void sumNFirstIntegersShouldReturnThreeWhenTwoNumbers() {
        assertThat(testee.sumNFirstIntegers(2)).isEqualTo(3);
    }

    @Test
    public void sumNFirstIntegersShouldReturn55When10Numbers() {
        assertThat(testee.sumNFirstIntegers(10)).isEqualTo(55);
    }
}
