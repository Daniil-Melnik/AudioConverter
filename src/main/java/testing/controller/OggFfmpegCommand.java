package testing.controller;

import java.util.ArrayList;
import java.util.List;

public class OggFfmpegCommand extends FfmpegCommand{
    @Override
    public List<String> getCommand(String ... args){

        String inputFile = args[0];
        String codecType = args[1];
        String sampleRate = args[2];
        String channels = args[3];
        String bitrate = args[4];
        String pathToUtil = args[5];
        String quality = args[6];
        String outputFile = args[7];

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
