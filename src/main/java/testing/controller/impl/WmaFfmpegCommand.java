package testing.controller.impl;

import lombok.AllArgsConstructor;
import testing.controller.FfmpegCommand;

import java.util.List;

@AllArgsConstructor
public class WmaFfmpegCommand extends FfmpegCommand {

    private String pathToUtil;

    @Override
    public List<String> getCommand(String... args) {

        String inputFile = args[0];
        String codecType = args[1];
        String bitrate = args[3];
        String sampleRate = args[4];
        String channels = args[5];
        String outputFile = args[5];

        return List.of(pathToUtil, "-i", inputFile, "-c:a", codecType, "-b:a", bitrate + "k", "-ar", sampleRate, "-ac", channels, "-y", outputFile);
    }
}
