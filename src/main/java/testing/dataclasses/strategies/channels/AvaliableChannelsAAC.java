package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;

import java.util.Map;

public class AvaliableChannelsAAC extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);
        ChannelInfo stereo = ChannelInfo.get("stereo", 2);
        ChannelInfo c51 = ChannelInfo.get("5.1", 6);

        channelsMap = Map.of(
            "aac", Map.of("mono", mono, "stereo", stereo, "5.1", c51),
            "libfdk_aac", Map.of("mono", mono, "stereo", stereo, "5.1", c51),
            "libmp3lame", Map.of("mono", mono, "stereo", stereo));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
