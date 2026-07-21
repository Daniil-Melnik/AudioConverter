package testing.model.dataclasses;

public class ChannelInfo {
    private String channelLayout;
    private int ac;

    private ChannelInfo(String cL, int ac){
        this.channelLayout = cL;
        this.ac = ac;
    }

    public static ChannelInfo get(String cL, int ac){
        return new ChannelInfo(cL, ac);
    }
}
