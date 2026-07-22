package testing.model.dataclasses;

public class ChannelInfo {
    private String name;
    private int ac;

    private ChannelInfo(String cL, int ac){
        this.name = cL;
        this.ac = ac;
    }

    public static ChannelInfo get(String cL, int ac){
        return new ChannelInfo(cL, ac);
    }
}
