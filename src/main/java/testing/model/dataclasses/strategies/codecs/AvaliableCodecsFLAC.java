package testing.model.dataclasses.strategies.codecs;

import java.util.Set;

public class AvaliableCodecsFLAC extends AvaliableCodecs{

    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of("flac", "alac");
    }
}
