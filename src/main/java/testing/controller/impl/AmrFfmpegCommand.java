package testing.controller.impl;

import lombok.AllArgsConstructor;
import testing.controller.FfmpegCommand;

import java.util.List;

@AllArgsConstructor
public class AmrFfmpegCommand extends FfmpegCommand {
    private String pathToUtil;

    public List<String> getCommand(String ... args){

        String inputFile = args[0];
        String codecType = args[1];
        String bitRate = args[2];
        String outputFile = args[3];

        return List.of(pathToUtil, "-i", inputFile, "-c:a", codecType, "-b:a", bitRate, "-ar", "8000", "-ac", "1", "-y", outputFile);
    }
}
