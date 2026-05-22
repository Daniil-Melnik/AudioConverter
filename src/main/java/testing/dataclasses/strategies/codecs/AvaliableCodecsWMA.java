package testing.dataclasses.strategies.codecs;

import java.util.Set;

public class AvaliableCodecsWMA extends AvaliableCodecs{
    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of("wmav2", "wmav1");
    }
}
