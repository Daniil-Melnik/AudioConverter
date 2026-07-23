package testing.model.dataclasses.strategies.channels;

import testing.model.dataclasses.ChannelInfo;
import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;

import java.util.List;
import java.util.Map;

public abstract class AvaliableChannels {
    public abstract List<ChannelTypes> getAvaliableChannels(Codecs codec);
}
