package testing.dataclasses.enums;

import testing.dataclasses.ChannelInfo;

public enum ChannelTypes {

    MONO(ChannelInfo.get("mono", 1)),
    STEREO(ChannelInfo.get("stereo", 2)),
    C21(ChannelInfo.get("2.1", 3)),
    C30(ChannelInfo.get("3.1", 3)),
    C40(ChannelInfo.get("4.0", 4)),
    C50(ChannelInfo.get("5.0", 5)),
    C51(ChannelInfo.get("5.1", 6)),
    C61(ChannelInfo.get("6.1", 7)),
    C71(ChannelInfo.get("7.1", 8)),
    C71W(ChannelInfo.get("7.1(wide)", 8));

    /*

    *
    * */

    private ChannelInfo info;

    private ChannelTypes(ChannelInfo i){ this.info = i;}

    public ChannelInfo info(){ return this.info;}
}
