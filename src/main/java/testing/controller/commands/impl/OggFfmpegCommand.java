package testing.controller.commands.impl;

import lombok.AllArgsConstructor;
import testing.controller.commands.FfmpegCommand;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class OggFfmpegCommand extends FfmpegCommand {
    private String pathToUtil;

    @Override
    public List<String> getCommand(String ... args){

        String inputFile = args[0];
        String codecType = args[1];
        String bitrate = args[2];
        String sampleRate = args[3];
        String quality = args[4];
        String channels = args[5];
        String outputFile = args[6];

        List<String> result = new ArrayList<>(14);
        result.addAll(List.of(pathToUtil, "-i", inputFile, "-c:a", codecType));
        switch (codecType){
            case "flac", "opus", "libvorbis":
                result.addAll(List.of("-ar", sampleRate, "-ac", channels));
                break;
            case "speex":
                result.addAll(List.of("-ar", "8000/16000", "-ac", "1", "-b:a", bitrate));
                break;
        }

        if (codecType.equals("libvorbis")) result.addAll(List.of("-q:a", quality));
        result.addAll(List.of("-y", outputFile));
        return result;
    }
}
