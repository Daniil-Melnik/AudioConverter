package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.ChannelInfo;
import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;

import static testing.model.dataclasses.enums.ChannelTypes.*;

public class AvaliableChannelsMP3 extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);
        ChannelInfo stereo = ChannelInfo.get("stereo", 2);
        ChannelInfo surround = ChannelInfo.get("2.1", 3);
        ChannelInfo c40 = ChannelInfo.get("4.0", 4);
        ChannelInfo c22 = ChannelInfo.get("2.2", 4);
        ChannelInfo c51 = ChannelInfo.get("5.1", 6);

        channelsMap = Map.of(
            "libmp3lame", List.of( MONO,  STEREO));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
