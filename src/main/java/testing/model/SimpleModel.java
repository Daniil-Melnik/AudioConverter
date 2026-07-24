package testing.model;

import testing.interfaces.Model;
import testing.model.dataclasses.ChannelInfo;
import testing.model.dataclasses.enums.Status;
import testing.model.dataclasses.infodto.TagFileInfoDTO;
import testing.model.dataclasses.modelblocks.TargetInfoBlock;

import java.security.cert.Extension;
import java.util.Map;
import java.util.Set;

public class SimpleModel implements Model {

    @Override
    public TagFileInfoDTO getFileTagInfo(String key) {
        return null;
    }

    @Override
    public void setFileTagInfo(String key, TagFileInfoDTO info) {

    }

    @Override
    public TargetInfoBlock getTargetInfo(String key) {
        return null;
    }

    @Override
    public void setTargetExtension(String key, Extension ext) {

    }

    @Override
    public void setTargetCodec(String key, String codec) {

    }

    @Override
    public void setTargetRate(String key, String rate) {

    }

    @Override
    public void setTargetChannels(String key, String channels) {

    }

    @Override
    public void setTargetBitrate(String key, String bitrate) {

    }

    @Override
    public void setTargetSampleSize(String key, int sampleSize) {

    }

    @Override
    public void setTargetDirectory(String newDirectory) {

    }

    @Override
    public Map<String, ChannelInfo> getAvaliableChannels(String codec) {
        return Map.of();
    }

    @Override
    public Set<String> getAvaliableRates() {
        return Set.of();
    }

    @Override
    public Set<String> getAvaliableCodecs() {
        return Set.of();
    }

    @Override
    public void setProgress(String key, double progress) {

    }

    @Override
    public void addTagsChanged(String key) {

    }

    @Override
    public void setStatus(String key, Status status) {

    }

    @Override
    public void setTargetFileName(String key, String fileName) {

    }

    @Override
    public double getProgress(String key) {
        return 0;
    }

    @Override
    public boolean getCahngedFile(String key) {
        return false;
    }

    @Override
    public Status getStatus(String key) {
        return null;
    }

    @Override
    public String getTargetFileName(String key) {
        return "";
    }

    @Override
    public Set<String> getFiles() {
        return Set.of();
    }

    @Override
    public long getDyration(String key) {
        return 0;
    }

    @Override
    public long getMaxVolume(String key) {
        return 0;
    }

    @Override
    public long getVolume(String key) {
        return 0;
    }

    @Override
    public String getCodec(String key) {
        return "";
    }

    @Override
    public String getRate(String key) {
        return "";
    }

    @Override
    public String getChannels(String key) {
        return "";
    }

    @Override
    public String getSampleSize(String key) {
        return "";
    }

    @Override
    public boolean getExecutionType() {
        return false;
    }

    @Override
    public boolean getParallelType() {
        return false;
    }

    @Override
    public String getCurrentFile() {
        return "";
    }

    @Override
    public long getDieskAvaliableSize(String targetDirectory) {
        return 0;
    }

    @Override
    public int getMaxQuantityOfThreads() {
        return 0;
    }
}
