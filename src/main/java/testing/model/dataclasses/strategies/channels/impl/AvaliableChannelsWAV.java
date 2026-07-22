package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import static testing.model.dataclasses.enums.ChannelTypes.*;

import java.util.List;
import java.util.Map;

public class AvaliableChannelsWAV extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    { 
        channelsMap = Map.of(
                "pcm_s16le", List.of(MONO, STEREO, C21, C30,  C40, C50, C51, C61, C71, C71W),
                "pcm_u8", List.of(MONO, STEREO, C21, C30, C40, C50, C51, C61, C71, C71W),
                "pcm_s24le", List.of(MONO, STEREO, C21, C30, C40, C50, C51, C61, C71, C71W),
                "pcm_f32le", List.of(MONO, STEREO, C21, C30, C40, C50, C51, C61, C71, C71W),
                "flac", List.of(MONO, STEREO, C21, C30, C40, C50, C51, C61, C71, C71W));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
