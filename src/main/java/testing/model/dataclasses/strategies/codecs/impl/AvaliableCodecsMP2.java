package testing.model.dataclasses.strategies.codecs.impl;

import testing.model.dataclasses.strategies.codecs.AvaliableCodecs;

import java.util.Set;

public class AvaliableCodecsMP2 extends AvaliableCodecs {
    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of("mp2");
    }
}
