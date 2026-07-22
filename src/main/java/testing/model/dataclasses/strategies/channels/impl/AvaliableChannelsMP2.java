package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;

import static testing.model.dataclasses.enums.ChannelTypes.MONO;
import static testing.model.dataclasses.enums.ChannelTypes.STEREO;

public class AvaliableChannelsMP2 extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
                "mp2", List.of(MONO, STEREO));

    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
