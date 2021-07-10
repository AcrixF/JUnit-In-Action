package org.neoa.junit5.ch02.assumptions.environment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TestsEnvironment {
    private JavaSpecification javaSpecification;
    private OperationSystem operationSystem;

    public boolean isWindows() {
        return operationSystem.getName().contains("Mac OS X");
    }

    public boolean isAmd64Architecture() {
        return operationSystem.getArchitecture().equals("aarch64");
    }

    public String getJavaVersion() {
        return javaSpecification.getVersion();
    }
}
