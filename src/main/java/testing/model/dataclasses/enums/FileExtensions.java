package testing.model.dataclasses.enums;

public enum FileExtensions {
    MP3("mp3"),
    MP2("mp2"),
    AAC("aac"),
    //AMR("amr"),
    FLAC("flac"),
    WAW("waw"),
    WMA("wma"),
    OGG("ogg");

    private String data;

    private FileExtensions(String s){
        this.data = s;
    }

    @Override
    public String toString() {
        return this.data;
    }
}
