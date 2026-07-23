package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;

import static testing.model.dataclasses.enums.ChannelTypes.MONO;
import static testing.model.dataclasses.enums.ChannelTypes.STEREO;

import static testing.model.dataclasses.enums.Codecs.MP2;

public class AvaliableChannelsMP2 extends AvaliableChannels {
    private Map<Codecs, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
                MP2, List.of(MONO, STEREO));

    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(Codecs codec) {
        return channelsMap.get(codec);
    }
}
