package org.neoa.junit5.ch02.dsb;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.neoa.junit5.ch02.lfcm.SUT;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled("Feature is still under construction.")
public class DisabledClassTest {

    private SUT systemUnderTest = new SUT("Our system under test");

    @Test
    void testRegularWork() {
        boolean canReceiveRegularWork = systemUnderTest.canReceiveRegularWork();
        assertTrue(canReceiveRegularWork);
    }

    @Test
    void testAdditionalWork() {
        boolean canReceiveAdditionalWork = systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
}
