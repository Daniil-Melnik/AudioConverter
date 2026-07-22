package testing.model.dataclasses.strategies.codecs.impl;

import testing.model.dataclasses.strategies.codecs.AvaliableCodecs;

import java.util.Set;

public class AvaliableCodecsAMR extends AvaliableCodecs {
    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of("libopencore_amrnb", "amr_nb");
    }
}
