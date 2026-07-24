package testing.interfaces;

import testing.model.dataclasses.*;
import testing.model.dataclasses.enums.Status;
import testing.model.dataclasses.infodto.TagFileInfoDTO;
import testing.model.dataclasses.modelblocks.TargetInfoBlock;

import java.security.cert.Extension;
import java.util.Map;
import java.util.Set;

public interface Model {
    TagFileInfoDTO getFileTagInfo(String key);
    void setFileTagInfo(String key, TagFileInfoDTO info);

    TargetInfoBlock getTargetInfo(String key);
    void setTargetExtension(String key, Extension ext);
    void setTargetCodec(String key, String codec);
    void setTargetRate(String key, String rate);
    void setTargetChannels(String key, String channels);
    void setTargetBitrate(String key, String bitrate);
    void setTargetSampleSize(String key, int sampleSize);
    void setTargetDirectory(String newDirectory);
    Map<String, ChannelInfo> getAvaliableChannels(String codec);
    Set<String> getAvaliableRates();
    Set<String> getAvaliableCodecs();

    void setProgress(String key, double progress);
    void addTagsChanged(String key);
    void setStatus(String key, Status status);
    void setTargetFileName(String key, String fileName);
    double getProgress(String key);
    boolean getCahngedFile(String key);
    Status getStatus(String key);
    String getTargetFileName(String key);

    Set<String> getFiles();
    long getDyration(String key);
    long getMaxVolume(String key);
    long getVolume(String key);
    String getCodec(String key);
    String getRate(String key);
    String getChannels(String key);
    String getSampleSize(String key);

    boolean getExecutionType();
    boolean getParallelType();

    String getCurrentFile();

    long getDieskAvaliableSize(String targetDirectory);
    int getMaxQuantityOfThreads();

}
