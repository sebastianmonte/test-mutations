package fi.gofore.blogs.testmutations;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberHelperTest {

    @Test
    public void thatPositiveNumberIsNonnegative() {
        assertTrue(NumberHelper.isNonnegative(1));
    }

    @Test
    public void thatNegativeNumberIsNotNonnegative() {
        assertFalse(NumberHelper.isNonnegative(-1));
    }

    @Test
    public void thatZeroIsNonnegative() {
        assertTrue(NumberHelper.isNonnegative(0));
    }
}
