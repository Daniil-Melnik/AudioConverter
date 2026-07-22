package testing.controller.impl;

import lombok.AllArgsConstructor;
import testing.controller.FfmpegCommand;

import java.util.List;

@AllArgsConstructor
public class Mp2FfmpegCommand extends FfmpegCommand {
    private String pathToUtil;

    public List<String> getCommand(String ... args){

        String inputFile = args[0];
        String codecType = args[1];
        String bitRate = args[2];
        String sampleRate = args[3];
        String channels = args[4];
        String outputFile = args[5];

        return List.of(pathToUtil, "-i", inputFile, "-c:a", codecType, "-b:a", bitRate, "-ar", sampleRate, "-ac", channels, "-y", outputFile);
    }
}
