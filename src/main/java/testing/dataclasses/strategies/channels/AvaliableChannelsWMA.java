package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;

import java.util.Map;

public class AvaliableChannelsWMA extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);
        ChannelInfo stereo = ChannelInfo.get("stereo", 2);
        ChannelInfo c21 = ChannelInfo.get("2.1", 3);
        ChannelInfo c30 = ChannelInfo.get("3.1", 3);
        ChannelInfo c40 = ChannelInfo.get("4.0", 4);
        ChannelInfo c50 = ChannelInfo.get("5.0", 5);
        ChannelInfo c51 = ChannelInfo.get("5.1", 6);
        ChannelInfo c61 = ChannelInfo.get("6.1", 7);
        ChannelInfo c71 = ChannelInfo.get("7.1", 8);
        ChannelInfo c71w = ChannelInfo.get("7.1(wide)", 8);

        channelsMap = Map.of(
                "wmav2", Map.of("mono", mono, "stereo", stereo, "2.1", c21, "3.0 (Surround)", c30, "4.0 (Quad)", c40, "5.0", c50, "5.1", c51, "6.1", c61, "7.1", c71, "7.1 (Wide Back)", c71w),
                "wmav1", Map.of("mono", mono, "stereo", stereo, "2.1", c21, "3.0 (Surround)", c30, "4.0 (Quad)", c40, "5.0", c50, "5.1", c51, "6.1", c61, "7.1", c71, "7.1 (Wide Back)", c71w));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
