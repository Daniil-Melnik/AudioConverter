package testing.controller.commands.impl;

import lombok.AllArgsConstructor;
import testing.controller.commands.FfmpegCommand;

import java.util.List;

@AllArgsConstructor
public class FlacCommand extends FfmpegCommand {

    private String utilPath;

    public List<String> getCommand(String ... args){
        String inputFile = args[0];
        String samplerate = args[1];
        String level = args[2];
        String channels = args[3];
        String layout = args[4];
        String outputFile = args[5];

        return List.of(
                utilPath,
                "-i", inputFile,
                "-c:a", "flac",
                "-compression_level", level,
                "-ar", samplerate,
                "-ac", channels,
                "channel_layout", layout,
                "-y", outputFile);
    }
}
