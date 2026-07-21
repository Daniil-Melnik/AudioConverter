package testing.controller;

import testing.model.dataclasses.strategies.channels.AvaliableChannels;
import testing.model.dataclasses.strategies.channels.AvaliableChannelsWAV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.Callable;

public class Tester {
    private static final String INPUT = "C:\\audio_test_3\\test.mp3";
    private static final String OUTPUT = "C:\\audio_test_3\\test.wav";

    private static final String PATH_TO_COMMAND = "C:\\Program Files\\ffmpeg\\bin\\ffmpeg.exe";

    private static void task(List<String> command) throws IOException, InterruptedException {
            ProcessBuilder builder = new ProcessBuilder();
            builder.redirectErrorStream(false);
            Process process = null;

            builder.command(command);
            process = builder.start();
            Process finalProcess = process;

            Thread stdout = new Thread(() ->{
                try{
                    BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(finalProcess.getInputStream()));
                    String line;
                    while ((line = stdoutReader.readLine()) != null){
                        System.out.println(line);
                    }
                } catch (IOException e){
                    System.out.println("Ошибка: " + e.getMessage());
                }

            });

            Thread stderr = new Thread(() -> {
                try{
                    BufferedReader stderrReader = new BufferedReader(new InputStreamReader(finalProcess.getErrorStream()));
                    String line;
                    while ((line = stderrReader.readLine()) != null){
                        System.out.println(line);
                    }
                } catch (IOException e){
                    System.out.println("Ошибка: " + e.getMessage());
                }
            });

            stderr.start();
            stdout.start();

            int exitCode = process.waitFor();

            stderr.join();
            stdout.join();

            if (exitCode == 0) System.out.println("converted");
    }

    public static void main(String ...args) throws IOException, InterruptedException {
        String codecType = "pcm_s16le";
        String channelLayout = "2.1";
        String sampleRate = "11025";
        String channels = "3";

        List<String> command = CommandBuilder.getWavCommand(
                INPUT,
                OUTPUT,
                codecType,
                sampleRate,
                channels,
                channelLayout,
                PATH_TO_COMMAND);

        task(command);
    }


}
