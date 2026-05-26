package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;
import static testing.dataclasses.enums.ChannelTypes.*;

import java.util.Map;

public class AvaliableChannelsOGG extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {

        channelsMap = Map.of(
                "flac", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "5.1", C51.info(), "7.1", C71.info()),
                "opus", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "5.1", C51.info(), "7.1", C71.info()),
                "speex", Map.of("mono", MONO.info()),
                "libvorbis", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "5.1", C51.info(), "7.1", C71.info()));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
