package testing.controller;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AacM4aFfmpegCommand extends FfmpegCommand{

    private String pathToUtil;

    public List<String> getCommand(String ... args){
        String inputFile = args[0];
        String codecType = args[1];
        String sampleRate = args[2];
        String channels = args[3];
        String bitrate = args[4];
        String outputFile = args[5];

        return List.of(
                pathToUtil,
                "-i", inputTitle,
                "-c:a", codecType,
                "-b:a", bitrate + "k",
                "-ar", sampleRate, "-ac",
                channels, "-y", destTitle);
    }
}
