package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.ChannelInfo;
import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;

import static testing.model.dataclasses.enums.Codecs.AMR_NB;
import static testing.model.dataclasses.enums.Codecs.LIBOPENCORE_AMRNB;

import static testing.model.dataclasses.enums.ChannelTypes.MONO;

public class AvaliableChannelsAMR extends AvaliableChannels {
    private Map<Codecs, List<ChannelTypes>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);

        channelsMap = Map.of(
            LIBOPENCORE_AMRNB, List.of(MONO),
            AMR_NB, List.of(MONO));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(Codecs codec) {
        return channelsMap.get(codec);
    }
}
