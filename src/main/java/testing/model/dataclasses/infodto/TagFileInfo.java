package testing.model.dataclasses.infodto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class TagFileInfo {
    private String title;
    private String album;
    private String artist;
    private String genre;
    private String comment;
    private String performer;
    private String disc;
    private String TKEY;
    private String TBPM;
    private String grouping;
    private String publisher;
    private String encodedBy;
    private String track;
    private String compilation;
    private String albumArtist;
    private String composer;
    private String date;
    private String url;

    public TagFileInfo(Map<String, String> map){
        title = map.getOrDefault("title", null);
        album = map.getOrDefault("album", null);
        artist = map.getOrDefault("artist", null);
        comment = map.getOrDefault("comment", null);
        genre = map.getOrDefault("genre", null);
        disc = map.getOrDefault("disc", null);
        performer = map.getOrDefault("performer", null);
        TKEY = map.getOrDefault("TKEY", null);
        TBPM = map.getOrDefault("TBPM", null);
        grouping = map.getOrDefault("grouping", null);
        publisher = map.getOrDefault("publisher", null);
        encodedBy = map.getOrDefault("encoded_by", null);
        track = map.getOrDefault("track", null);
        compilation = map.getOrDefault("compilation", null);
        albumArtist = map.getOrDefault("album_artist", null);
        composer = map.getOrDefault("composer", null);
        date = map.getOrDefault("date", null);
        url = map.getOrDefault("url", null);
    }
}
