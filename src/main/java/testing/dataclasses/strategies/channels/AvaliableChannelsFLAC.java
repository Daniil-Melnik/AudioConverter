package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;
import static testing.dataclasses.enums.ChannelTypes.*;

import java.util.Map;

public class AvaliableChannelsFLAC extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {
        channelsMap = Map.of(
                "alac",  Map.of("mono", MONO.info(), "stereo", STEREO.info(), "surround (3.0)", C30.info(), "Quad (4.0)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "Wide Back 7.1", C71W.info()),
                "flac", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "Surround (3.0)", C30.info(), "Quad (4.0)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info()));

    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
