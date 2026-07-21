package testing.model.dataclasses.strategies.codecs;

import java.util.Set;

public class AvaliableCodecsAAC extends AvaliableCodecs{

    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of("aac", "libfdk_aac", "libmp3lame");
    }
}
