package testing.model.dataclasses.strategies.channels;

import testing.model.dataclasses.ChannelInfo;

import java.util.Map;

import static testing.model.dataclasses.enums.ChannelTypes.MONO;
import static testing.model.dataclasses.enums.ChannelTypes.STEREO;

public class AvaliableChannelsMP2 extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {

        channelsMap = Map.of(
                "mp2", Map.of("mono", MONO.info(), "stereo", STEREO.info()),
                "mp3", Map.of("mono", MONO.info(), "stereo", STEREO.info()));

    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
