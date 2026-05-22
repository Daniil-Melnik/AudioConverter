package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;

import java.util.Map;

public class AvaliableChannelsOGG extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);
        ChannelInfo stereo = ChannelInfo.get("stereo", 2);
        ChannelInfo c51 = ChannelInfo.get("5.1", 6);
        ChannelInfo c71 = ChannelInfo.get("7.1", 8);

        channelsMap = Map.of(
                "flac", Map.of("mono", mono, "stereo", stereo, "5.1", c51, "7.1", c71),
                "opus", Map.of("mono", mono, "stereo", stereo, "5.1", c51, "7.1", c71),
                "speex", Map.of("mono", mono),
                "libvorbis", Map.of("mono", mono, "stereo", stereo, "5.1", c51, "7.1", c71));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
