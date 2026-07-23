package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import static testing.model.dataclasses.enums.ChannelTypes.*;
import static testing.model.dataclasses.enums.Codecs.FLAC;

import java.util.List;
import java.util.Map;

public class AvaliableChannelsFLAC extends AvaliableChannels {
    private Map<Codecs, List<ChannelTypes>> channelsMap;

    {
        channelsMap = Map.of(
                FLAC,  List.of(MONO, STEREO, C21, C30, C40, C50, C51, C61, C71, C71W)
                );

    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(Codecs codec) {
        return channelsMap.get(codec);
    }
}
