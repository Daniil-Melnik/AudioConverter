package testing.dataclasses.strategies.channels;

import testing.dataclasses.ChannelInfo;

import java.util.Map;

public abstract class AvaliableChannels {
    public abstract Map<String, ChannelInfo> getAvaliableChannels(String codec);
}
