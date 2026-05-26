package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;
import static testing.dataclasses.enums.ChannelTypes.*;

import java.util.Map;

public class AvaliableChannelsWAV extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    { 
        channelsMap = Map.of(
                "pcm_s16le", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "2.1", C21.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info(), "7.1 (Wide Back)", C71W.info()),
                "pcm_u8", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "2.1", C21.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info(), "7.1 (Wide Back)", C71W.info()),
                "pcm_s24le", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "2.1", C21.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info(), "7.1 (Wide Back)", C71W.info()),
                "pcm_f32le", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "2.1", C21.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info(), "7.1 (Wide Back)", C71W.info()),
                "alac", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1 (Wide Back)", C71W.info()),
                "flac", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "2.1", C21.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info(), "7.1 (Wide Back)", C71W.info()));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
