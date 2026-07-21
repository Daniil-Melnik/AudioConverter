package testing.model.dataclasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FileTagInfo {
    private String title;
    private String executor;
    private String album;
    private int year;
    private String copyRight;
    private String composer;
    private String url;
    private String author;
}
