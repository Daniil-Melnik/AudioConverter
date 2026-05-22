package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;

import java.util.Map;

public class AvaliableChannelsMP3 extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);
        ChannelInfo stereo = ChannelInfo.get("stereo", 2);
        ChannelInfo surround = ChannelInfo.get("2.1", 3);
        ChannelInfo c40 = ChannelInfo.get("4.0", 4);
        ChannelInfo c22 = ChannelInfo.get("2.2", 4);
        ChannelInfo c51 = ChannelInfo.get("5.1", 6);

        channelsMap = Map.of(
            "mp3", Map.of("mono", mono, "stereo", stereo),
            "libmp3lame", Map.of("mono", mono, "stereo", stereo),
            "ac3", Map.of("mono", mono, "stereo", stereo, "2.1", surround, "4.0", c40, "5.1", c51, "2.2", c22),
            "wmav2", Map.of("mono", mono, "stereo", stereo));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
