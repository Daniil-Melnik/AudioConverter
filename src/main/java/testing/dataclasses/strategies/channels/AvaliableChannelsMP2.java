package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;

import java.util.Map;

public class AvaliableChannelsMP2 extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);
        ChannelInfo stereo = ChannelInfo.get("stereo", 2);

        channelsMap = Map.of(
                "mp2", Map.of("mono", mono, "stereo", stereo),
                "mp3", Map.of("mono", mono, "stereo", stereo));

    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
