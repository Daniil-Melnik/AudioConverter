package testing.controller.commands.impl;

import lombok.AllArgsConstructor;
import testing.controller.commands.FfmpegCommand;

import java.util.List;

@AllArgsConstructor
public class Mp3FfmpegCommand extends FfmpegCommand {

    private String pathToUtil;

    public List<String> getCommand(String ... args){

        String inputFile = args[0];
        String codecType = args[1];
        String sampleRate = args[2];
        String channels = args[3];
        String outputFile = args[4];

        return List.of(pathToUtil, "-i", inputFile, "-c:a", codecType, "-ar", sampleRate, "-ac", channels, "-y", outputFile);
    }
}
