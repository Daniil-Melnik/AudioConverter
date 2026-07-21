package testing.model.dataclasses.strategies.channels;

import testing.model.dataclasses.ChannelInfo;

import java.util.Map;

public abstract class AvaliableChannels {
    public abstract Map<String, ChannelInfo> getAvaliableChannels(String codec);
}
