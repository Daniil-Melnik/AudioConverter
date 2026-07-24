package testing.model.dataclasses.infodto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
// dto для переноса инфы о файле от парсера в блок хранилища
public class InitFileInfoDTO {
    private String paths;
    private float duration;
    private long volume;
    private int maxVolume;
    private String currentCodec;
    private int frequency;
    private String standard;
    private int channels;
}
