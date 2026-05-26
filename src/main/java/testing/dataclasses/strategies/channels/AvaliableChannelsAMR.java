package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;

import java.util.Map;

import static testing.dataclasses.enums.ChannelTypes.MONO;

public class AvaliableChannelsAMR extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);

        channelsMap = Map.of(
            "libopencore_amrnb", Map.of("mono", MONO.info()),
            "amr_nb", Map.of("mono", MONO.info()));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
