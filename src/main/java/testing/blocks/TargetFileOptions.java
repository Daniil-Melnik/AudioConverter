package testing.blocks;

import lombok.Getter;
import lombok.Setter;
import testing.dataclasses.ChannelInfo;
import testing.dataclasses.enums.FileExtensions;
import testing.dataclasses.strategies.channels.AvaliableChannels;
import testing.dataclasses.strategies.codecs.AvaliableCodecs;
import testing.dataclasses.strategies.rates.AvaliableRates;

@Getter
@Setter
public class TargetFileOptions {
    private AvaliableChannels avaliableChannelsStrategy; // стратегии для определения доступныйх вариантов расширений
    private AvaliableCodecs avaliableCodecsStrategy;
    private AvaliableRates avaliableRatesStrategy;

    private FileExtensions targetExtension;
    private String targetCodec;
    private ChannelInfo targetChannelInfo;
    private String targetBitRate;
    private String targetSampleSize;
    private String targetDirectory;
    // доработать
}
