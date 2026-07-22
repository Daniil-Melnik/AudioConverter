package testing.model.dataclasses.strategies.channels.impl;

import testing.model.dataclasses.ChannelInfo;
import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;

import java.util.List;
import java.util.Map;

import static testing.model.dataclasses.enums.ChannelTypes.MONO;

public class AvaliableChannelsAMR extends AvaliableChannels {
    private Map<String, List<ChannelTypes>> channelsMap;

    {
        ChannelInfo mono = ChannelInfo.get("mono", 1);

        channelsMap = Map.of(
            "libopencore_amrnb", List.of(MONO),
            "amr_nb", List.of(MONO));
    }


    @Override
    public List<ChannelTypes> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
