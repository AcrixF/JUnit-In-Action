package org.neoa.junit5.ch02.dsb;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.neoa.junit5.ch02.lfcm.SUT;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DisableMethodTest {

    private SUT systemUnderTest = new SUT("Our System under test");

    @Test
    @Disabled
    void testRegularWork() {
        boolean canReceiveRegularWork = systemUnderTest.canReceiveRegularWork();
        assertTrue(canReceiveRegularWork);
    }

    @Test
    @Disabled("Feature still under construction")
    void testAdditionalWork() {
        boolean canReceiveAdditionalWork = systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
}
