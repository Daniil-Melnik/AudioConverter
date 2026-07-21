package testing.model.dataclasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import testing.model.dataclasses.enums.ChannelTypes;
import testing.model.dataclasses.enums.FileExtensions;

@AllArgsConstructor
@Getter
@Setter
public class TargetInfo {
    private FileExtensions extension;
    private String targetCodec;
    private String targetRate;
    private ChannelTypes channelType;
    private String bitRate;
    private String sampleSize;
    private String targetPath;
}
