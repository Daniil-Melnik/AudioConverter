package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;
import static testing.model.dataclasses.enums.ChannelTypes.*;

import static testing.model.dataclasses.enums.Codecs.WMAV1;
import static testing.model.dataclasses.enums.Codecs.WMAV2;

public class AvaliableChannelsWMA extends AvaliableChannels {
    private Map<Codecs, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
                WMAV2, List.of(MONO, STEREO),
                WMAV1, List.of(MONO, STEREO));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(Codecs codec) {
        return channelsMap.get(codec);
    }
}
