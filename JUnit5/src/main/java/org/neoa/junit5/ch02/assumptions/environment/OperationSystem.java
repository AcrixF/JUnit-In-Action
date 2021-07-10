package org.neoa.junit5.ch02.assumptions.environment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OperationSystem {

    private String name;
    private String architecture;
}
