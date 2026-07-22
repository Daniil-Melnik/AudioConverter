package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;
import static testing.model.dataclasses.enums.ChannelTypes.*;

public class AvaliableChannelsWMA extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
                "wmav2", List.of(MONO, STEREO, C21, C30, C40, C50, C51, C61, C71, C71W),
                "wmav1", List.of(MONO, STEREO, C21, C30, C40, C50, C51, C61, C71, C71W));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
