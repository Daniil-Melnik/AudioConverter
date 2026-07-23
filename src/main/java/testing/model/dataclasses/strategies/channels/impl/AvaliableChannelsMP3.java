package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.ChannelInfo;
import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;

import static testing.model.dataclasses.enums.ChannelTypes.*;
import static testing.model.dataclasses.enums.Codecs.LIBMP3LAME;

public class AvaliableChannelsMP3 extends AvaliableChannels {
    private Map<Codecs, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
            LIBMP3LAME, List.of( MONO,  STEREO));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(Codecs codec) {
        return channelsMap.get(codec);
    }
}
