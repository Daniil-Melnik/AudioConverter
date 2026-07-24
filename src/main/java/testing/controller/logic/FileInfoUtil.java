package testing.controller.logic;

import com.github.kokorin.jaffree.ffprobe.FFprobe;
import com.github.kokorin.jaffree.ffprobe.FFprobeResult;
import com.github.kokorin.jaffree.ffprobe.Format;
import com.github.kokorin.jaffree.ffprobe.Stream;
import testing.model.dataclasses.infodto.InitFileInfo;
import testing.model.dataclasses.infodto.TagFileInfo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileInfoUtil {
    public static InitFileInfo getInitFileInfo(String pathToFile){

        String codecName = null;
        int frequency = -1;
        int numOfChannels = -1;
        float duration = -1;
        long volume = -1;
        String standard = null;

        try {
            FFprobeResult result = FFprobe.atPath()
                    .setShowStreams(true)
                    .setInput(pathToFile)
                    .execute();

            for (Stream stream : result.getStreams()){
                String codecType = stream.getCodecType().toString();
                if (codecType.equalsIgnoreCase("audio")){
                    codecName = stream.getCodecName();
                    frequency = stream.getSampleRate();
                    numOfChannels = stream.getChannels();
                    duration = stream.getDuration();
                    volume = (new File(pathToFile)).length() / 1024 / 1024;
                    frequency = stream.getSampleRate();
                    standard = stream.getChannelLayout();
                }
            }
        } catch (Exception e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
        return new InitFileInfo(pathToFile, duration, volume, -1, codecName, frequency, standard, numOfChannels);
    }

    public static TagFileInfo getTagFileInfo(String pathToFile){

        Map<String, String> map = new HashMap<>();

        try {
            FFprobeResult result = FFprobe.atPath()
                    .setShowFormat(true)
                    .setInput(pathToFile)
                    .execute();
            Format format = result.getFormat();
            if (format != null){
                map.put("title", format.getTag("title"));
                map.put("album", format.getTag("album"));
                map.put("artist", format.getTag("artist"));
                map.put("performer", format.getTag("performer"));
                map.put("disc", format.getTag("disc"));
                map.put("TKEY", format.getTag("TKEY"));
                map.put("TBPM", format.getTag("TBPM"));

                map.put("grouping", format.getTag("grouping"));
                map.put("publisher", format.getTag("publisher"));
                map.put("encoded_by", format.getTag("encoded_by"));
                map.put("track", format.getTag("track"));
                map.put("album_artist", format.getTag("album_artist"));
                map.put("genre", format.getTag("genre"));
                map.put("comment", format.getTag("comment"));
                map.put("composer", format.getTag("composer"));
                map.put("date", format.getTag("date"));
                map.put("url", format.getTag("id3v2_priv.WM/Mood"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new TagFileInfo(map);
    }

    public static void main (String ... args){
        getTagFileInfo("C:\\audio_test_3\\test.mp3");
    }
}
