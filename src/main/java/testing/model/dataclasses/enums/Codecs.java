package testing.model.dataclasses.enums;

public enum Codecs {
    AAC("aac"),
    LIBFDK_AAC("libfdk_aac"),
    LIBMP3LAME("libmp3lame"),
    LIBOPENCORE_AMRNB("libopencore_amrnb"),
    AMR_NB("amr_nb"),
    FLAC("flac"),
    ALAC("alac"),
    MP2("mp2"),
    MP3("mp3"),
    AC3("ac3"),
    WMAV2("wmav2"),
    OPUS("opus"),
    SPEEX("speex"),
    LIBVORBIS("libvorbis"),
    PCM_S16LE("pcm_s16le"),
    PCM_U8("pcm_u8"),
    PCM_S24LE("pcm_s24le"),
    PCM_F32LE("pcm_f32le"),
    WMAV1("alac");

    private String name;
    private boolean isChLAvalible;

    private Codecs(String n){};
}
