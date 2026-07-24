package testing.model.dataclasses.modelblocks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.Codecs;
import testing.model.dataclasses.enums.FileExtensions;

@AllArgsConstructor
@Getter
@Setter
public class TargetInfoBlock {
    private FileExtensions extension;
    private Codecs targetCodec;
    private String targetRate;
    private ChannelTypes channelType;
    private String bitRate;
    private String sampleSize;
    private String targetPath;
}
