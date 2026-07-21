package testing.model.blocks;

import lombok.Getter;
import lombok.Setter;
import testing.model.dataclasses.ChannelInfo;
import testing.model.dataclasses.enums.FileExtensions;
import testing.model.dataclasses.strategies.channels.AvaliableChannels;
import testing.model.dataclasses.strategies.codecs.AvaliableCodecs;
import testing.model.dataclasses.strategies.rates.AvaliableRates;

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
