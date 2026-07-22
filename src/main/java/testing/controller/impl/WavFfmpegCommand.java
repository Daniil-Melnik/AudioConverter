package testing.controller.impl;

import lombok.AllArgsConstructor;
import testing.controller.FfmpegCommand;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class WavFfmpegCommand extends FfmpegCommand {
    private String pathToUtil;
    public List<String> getCommand(String ... args){

        String inputFile = args[0];
        String codecType = args[1];
        String sampleRate = args[2];
        String channels = args[3];
        String layout = args[4];
        String outputFile = args[5];

        List<String> result = new ArrayList<>(11);
        result.addAll(List.of(pathToUtil, "-i", inputFile, "-c:a", codecType, "-ar", sampleRate, "-ac", channels));
        if (layout != null){
            result.addAll(List.of("-channel_layout", layout));
        }
        result.addAll(List.of("-y", outputFile));
        return result;
    }
}
