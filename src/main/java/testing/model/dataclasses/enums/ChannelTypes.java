package testing.model.dataclasses.enums;

import testing.model.dataclasses.ChannelInfo;

public enum ChannelTypes {

    MONO(ChannelInfo.get("1 (mono)", 1)),
    STEREO(ChannelInfo.get("2 (stereo)", 2)),
    C21(ChannelInfo.get("3 (2.1)", 3)),
    C22(ChannelInfo.get("4 (2.2)", 4)),
    C30(ChannelInfo.get("3 (3.1)", 3)),
    C40(ChannelInfo.get("4 (4.0)", 4)),
    C50(ChannelInfo.get("5 (5.0)", 5)),
    C51(ChannelInfo.get("6 (5.1)", 6)),
    C61(ChannelInfo.get("7 (6.1)", 7)),
    C71(ChannelInfo.get("8 (7.1)", 8)),
    C71W(ChannelInfo.get("8 (7.1 wide)", 8));

    private ChannelInfo info;

    private ChannelTypes(ChannelInfo i){ this.info = i;}

    public ChannelInfo info(){ return this.info;}

    @Override
    public String toString() {
        return info.getName();
    }
}
