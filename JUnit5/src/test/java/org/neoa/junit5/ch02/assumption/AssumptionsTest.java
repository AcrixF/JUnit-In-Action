package org.neoa.junit5.ch02.assumption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.neoa.junit5.ch02.assumptions.Job;
import org.neoa.junit5.ch02.assumptions.SUT;
import org.neoa.junit5.ch02.assumptions.environment.JavaSpecification;
import org.neoa.junit5.ch02.assumptions.environment.OperationSystem;
import org.neoa.junit5.ch02.assumptions.environment.TestsEnvironment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumptionsTest {
    private static final String EXPECTED_JAVA_VERSION = "15";
    private final TestsEnvironment environment = new TestsEnvironment(
            new JavaSpecification(
                    System.getProperty("java.vm.specification.version")),
            new OperationSystem(
                    System.getProperty("os.name"),
                    System.getProperty("os.arch"))
            );

    private final SUT systemUnderTest = new SUT();

    @BeforeEach
    void setUp() {
        assumeTrue(environment.isWindows());
    }

    @Test
    void setSystemUnderTestDoesNotHaveJobToRun() {
        assumingThat(
                () -> environment.getJavaVersion().equals(EXPECTED_JAVA_VERSION),
                () -> assertFalse(systemUnderTest.hasJobToRun()));
    }

    @Test
    void testJobToRun() {
        assumeTrue(environment.isAmd64Architecture());
        systemUnderTest.run(new Job());
        assumeTrue(systemUnderTest.hasJobToRun());
    }
}
