package org.neoa.junit5.ch02.assumptions;

import lombok.Setter;

@Setter
public class SUT {
    private Job currentJob;

    public boolean hasJobToRun() {
        return currentJob != null;
    }

    public void run(Job newJob) {
        currentJob = newJob;
    }
}
