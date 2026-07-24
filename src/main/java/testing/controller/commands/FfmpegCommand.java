package testing.controller.commands;

import java.util.List;

public abstract class FfmpegCommand {
    public abstract List<String> getCommand(String ... args);
}
