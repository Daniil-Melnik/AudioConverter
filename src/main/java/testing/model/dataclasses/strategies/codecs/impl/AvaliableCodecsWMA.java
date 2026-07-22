package testing.model.dataclasses.strategies.codecs.impl;

import testing.model.dataclasses.strategies.codecs.AvaliableCodecs;

import java.util.Set;

public class AvaliableCodecsWMA extends AvaliableCodecs {
    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of("wmav2", "wmav1");
    }
}
