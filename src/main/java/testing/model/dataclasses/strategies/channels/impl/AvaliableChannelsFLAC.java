package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import static testing.model.dataclasses.enums.ChannelTypes.*;

import java.util.List;
import java.util.Map;

public class AvaliableChannelsFLAC extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    {
        channelsMap = Map.of(
                "alac",  List.of(MONO, STEREO, C30, C40, C50, C51, C61, C71W)
                );

    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
