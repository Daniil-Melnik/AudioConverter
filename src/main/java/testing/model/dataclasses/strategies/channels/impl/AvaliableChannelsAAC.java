package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import static testing.model.dataclasses.enums.ChannelTypes.MONO;
import static testing.model.dataclasses.enums.ChannelTypes.STEREO;
import static testing.model.dataclasses.enums.ChannelTypes.C51;


import java.util.List;
import java.util.Map;

public class AvaliableChannelsAAC extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
            "aac", List.of(MONO, STEREO, C51),
            "libfdk_aac", List.of(MONO, STEREO, C51));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
