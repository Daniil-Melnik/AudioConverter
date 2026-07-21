package testing.controller;

import java.util.List;

public abstract class FfmpegCommand {
    public abstract List<String> getCommand(String ... args);
}
