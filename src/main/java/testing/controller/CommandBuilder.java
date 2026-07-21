package testing.controller;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder {
    private static final String COMMAND = "ffmpeg";

    public static List<String> getMp3Command(String inputTitle,
                                       String destTitle,
                                       String codecType,
                                       String sampleRate,
                                       String channels,
                                       String pathToUtil){

        return List.of(pathToUtil, "-i", inputTitle, "-c:a", codecType, "-ar", sampleRate, "-ac", channels, "-y", destTitle);
    }

    public static List<String> getWavCommand(String inputTitle,
                                             String destTitle,
                                             String codecType,
                                             String sampleRate,
                                             String channels,
                                             String layout,
                                             String pathToUtil){
        List<String> result = new ArrayList<>(11);
        result.addAll(List.of(pathToUtil, "-i", inputTitle, "-c:a", codecType, "-ar", sampleRate, "-ac", channels));
        if (layout != null){
            result.addAll(List.of("-channel_layout", layout));
        }
        result.addAll(List.of("-y", destTitle));
        return result;
    }

    public static List<String> getAacM4aCommand(String inputTitle,
                                                String destTitle,
                                                String codecType,
                                                String sampleRate,
                                                String channels,
                                                String bitrate,
                                                String pathToUtil){
        return List.of(
                pathToUtil,
                "-i", inputTitle,
                "-c:a", codecType,
                "-b:a", bitrate + "k",
                "-ar", sampleRate, "-ac",
                channels, "-y", destTitle);
    }
}
