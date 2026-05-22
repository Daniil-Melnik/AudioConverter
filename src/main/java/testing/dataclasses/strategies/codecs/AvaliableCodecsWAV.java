package testing.dataclasses.strategies.codecs;

import java.util.Set;

public class AvaliableCodecsWAV extends AvaliableCodecs{
    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of("pcm_s16le", "pcm_u8", "pcm_s24le", "pcm_f32le", "alac", "flac");
    }
}
