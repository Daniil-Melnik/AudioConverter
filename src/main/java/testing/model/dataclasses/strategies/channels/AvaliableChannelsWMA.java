package testing.model.dataclasses.strategies.channels;

import testing.model.dataclasses.ChannelInfo;

import java.util.Map;
import static testing.model.dataclasses.enums.ChannelTypes.*;

public class AvaliableChannelsWMA extends AvaliableChannels{
    private Map<String, Map<String, ChannelInfo>> channelsMap;

    {

        channelsMap = Map.of(
                "wmav2", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "2.1", C21.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info(), "7.1 (Wide Back)", C71W.info()),
                "wmav1", Map.of("mono", MONO.info(), "stereo", STEREO.info(), "2.1", C21.info(), "3.0 (Surround)", C30.info(), "4.0 (Quad)", C40.info(), "5.0", C50.info(), "5.1", C51.info(), "6.1", C61.info(), "7.1", C71.info(), "7.1 (Wide Back)", C71W.info()));
    }


    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return channelsMap.get(codec);
    }
}
