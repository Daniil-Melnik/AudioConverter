package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;
import static testing.dataclasses.enums.ChannelTypes.MONO;
import static testing.dataclasses.enums.ChannelTypes.STEREO;
import static testing.dataclasses.enums.ChannelTypes.C51;


import java.util.Map;

public class AvaliableChannelsAAC extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {

        channelsMap = Map.of(
            "aac", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "5.1", C51.info()),
            "libfdk_aac", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "5.1", C51.info()),
            "libmp3lame", Map.of("mono", MONO.info(), "stereo", STEREO.info()));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
