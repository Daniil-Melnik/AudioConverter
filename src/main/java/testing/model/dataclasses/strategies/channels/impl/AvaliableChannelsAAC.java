package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import static testing.model.dataclasses.enums.ChannelTypes.MONO;
import static testing.model.dataclasses.enums.ChannelTypes.STEREO;
import static testing.model.dataclasses.enums.ChannelTypes.C51;
import static testing.model.dataclasses.enums.ChannelTypes.C71;

import static testing.model.dataclasses.enums.Codecs.AAC;

import java.util.List;
import java.util.Map;

public class AvaliableChannelsAAC extends AvaliableChannels {
    private Map<Codecs, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
            AAC, List.of(MONO, STEREO, C51, C71));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(Codecs codec) {
        return channelsMap.get(codec);
    }
}
