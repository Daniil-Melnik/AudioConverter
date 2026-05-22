package testing.interfaces;

import testing.dataclasses.*;
import testing.dataclasses.enums.Status;

import java.security.cert.Extension;

public interface Model {
    FileTagInfo getFileTagInfo(String key);
    void setFileTagInfo(String key, FileTagInfo info);

    TargetInfo getTargetInfo(String key);
    void setTargetExtension(String key, Extension ext);
    void setTargetCodec(String key, String codec);
    void setTargetRate(String key, String rate);
    void setTargetChannels(String key, String channels);
    void setTargetBitrate(String key, String bitrate);
    void setTargetSampleSize(String key, int sampleSize);
    void setTargetDirectory(String newDirectory);

    void setProgress(String key, double progress);
    void addTagsChanged(String key);
    void setStatus(String key, Status status);
    void setTargetFileName(String key, String fileName);
    double getProgress(String key);
    boolean getCahngedFile(String key);
    Status getStatus(String key);
    String getTargetFileName(String key);
}
