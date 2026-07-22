package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import static testing.model.dataclasses.enums.ChannelTypes.*;

import java.util.List;
import java.util.Map;

public class AvaliableChannelsOGG extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
                "flac", List.of(MONO, STEREO, C51, C71),
                "libopus", List.of(MONO, STEREO, C51, C71),
                "libspeex", List.of(MONO),
                "libvorbis", List.of(MONO, STEREO, C51, C71));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
