package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import static testing.model.dataclasses.enums.ChannelTypes.*;

import static testing.model.dataclasses.enums.Codecs.FLAC;
import static testing.model.dataclasses.enums.Codecs.LIBOPUS;
import static testing.model.dataclasses.enums.Codecs.LIBSPEEX;
import static testing.model.dataclasses.enums.Codecs.LIBVORBIS;

import java.util.List;
import java.util.Map;

public class AvaliableChannelsOGG extends AvaliableChannels {
    private Map<Codecs, List<ChannelTypes>> channelsMap;

    {

        channelsMap = Map.of(
                FLAC, List.of(MONO, STEREO, C51, C71),
                LIBOPUS, List.of(MONO, STEREO, C51, C71, C21, C30, C40, C50, C61),
                LIBSPEEX, List.of(MONO),
                LIBVORBIS, List.of(MONO, STEREO, C51, C71, C21, C30, C40, C50, C61));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(Codecs codec) {
        return channelsMap.get(codec);
    }
}
